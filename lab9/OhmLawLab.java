package lab9;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OhmLawLab extends JFrame {
    private static final long serialVersionUID = 1L;
    
    // Оголошення текстових полів
    private JTextField txtR;
    private JTextField txtU;
    private JTextField txtI;
    
    // Оголошення кнопок
    private JButton btnCalculate;
    private JButton btnClear;

    public OhmLawLab() {
        // Налаштування головного вікна (фрейму)
        setTitle("Закон Ома (Варіант 16)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 220);
        setLayout(null); // Використання абсолютного позиціювання

        // Створення об'єктів елементів керування
        JLabel label1 = new JLabel("Опір (R):");
        label1.setBounds(40, 30, 100, 20);
        add(label1);

        txtR = new JTextField();
        txtR.setBounds(150, 30, 150, 20);
        add(txtR);

        JLabel label2 = new JLabel("Напруга (U):");
        label2.setBounds(40, 60, 100, 20);
        add(label2);

        txtU = new JTextField();
        txtU.setBounds(150, 60, 150, 20);
        add(txtU);

        JLabel label3 = new JLabel("Сила струму (I):");
        label3.setBounds(40, 90, 100, 20);
        add(label3);

        txtI = new JTextField();
        txtI.setBounds(150, 90, 150, 20);
        add(txtI);

        // Кнопка для обчислення
        btnCalculate = new JButton("Обчислити");
        btnCalculate.setBounds(40, 130, 120, 30);
        add(btnCalculate);

        // Кнопка для очищення форми (корисна для тестування додаткового завдання)
        btnClear = new JButton("Очистити");
        btnClear.setBounds(180, 130, 120, 30);
        add(btnClear);

        // --- РЕАЛІЗАЦІЯ ДОДАТКОВОГО ЗАВДАННЯ ---
        // Слухач для відслідковування змін у текстових полях
        DocumentListener documentListener = new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { checkAndLockFields(); }
            public void removeUpdate(DocumentEvent e) { checkAndLockFields(); }
            public void changedUpdate(DocumentEvent e) { checkAndLockFields(); }
        };

        // Підписуємо всі поля на слухача
        txtR.getDocument().addDocumentListener(documentListener);
        txtU.getDocument().addDocumentListener(documentListener);
        txtI.getDocument().addDocumentListener(documentListener);

        // Обробник натискання на кнопку "Обчислити"
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });

        // Обробник натискання на кнопку "Очистити"
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtR.setText("");
                txtU.setText("");
                txtI.setText("");
                // Розблоковуємо всі поля
                txtR.setEditable(true);
                txtU.setEditable(true);
                txtI.setEditable(true);
            }
        });

        // Відображення форми
        setVisible(true);
    }

    /**
     * Метод для перевірки заповненості полів та їх блокування
     */
    private void checkAndLockFields() {
        boolean hasR = !txtR.getText().trim().isEmpty();
        boolean hasU = !txtU.getText().trim().isEmpty();
        boolean hasI = !txtI.getText().trim().isEmpty();

        int filledCount = (hasR ? 1 : 0) + (hasU ? 1 : 0) + (hasI ? 1 : 0);

        // Якщо заповнено два поля, третє робиться недоступним
        if (filledCount == 2) {
            if (!hasR) txtR.setEditable(false);
            if (!hasU) txtU.setEditable(false);
            if (!hasI) txtI.setEditable(false);
        } else if (filledCount < 2) {
            // Якщо полів менше двох, дозволяємо ввід усюди
            txtR.setEditable(true);
            txtU.setEditable(true);
            txtI.setEditable(true);
        }
    }

    /**
     * Метод для розв'язання прямої та обернених задач
     */
    private void calculateResult() {
        try {
            boolean hasR = !txtR.getText().trim().isEmpty();
            boolean hasU = !txtU.getText().trim().isEmpty();
            boolean hasI = !txtI.getText().trim().isEmpty();

            // Обчислення сили струму (I = U / R)
            if (hasU && hasR && !hasI) {
                double u = Double.parseDouble(txtU.getText());
                double r = Double.parseDouble(txtR.getText());
                if (r == 0) {
                    JOptionPane.showMessageDialog(this, "Опір не може дорівнювати нулю!");
                    return;
                }
                txtI.setText(String.format("%.4f", u / r));
            } 
            // Обчислення напруги (U = I * R)
            else if (hasI && hasR && !hasU) {
                double i = Double.parseDouble(txtI.getText());
                double r = Double.parseDouble(txtR.getText());
                txtU.setText(String.format("%.4f", i * r));
            } 
            // Обчислення опору (R = U / I)
            else if (hasU && hasI && !hasR) {
                double u = Double.parseDouble(txtU.getText());
                double i = Double.parseDouble(txtI.getText());
                if (i == 0) {
                    JOptionPane.showMessageDialog(this, "Сила струму не може дорівнювати нулю!");
                    return;
                }
                txtR.setText(String.format("%.4f", u / i));
            } else {
                JOptionPane.showMessageDialog(this, "Введіть рівно два значення для обчислення!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Помилка формату! Переконайтеся, що ви ввели числа.");
        }
    }

    public static void main(String[] args) {
        // Запуск програми
        new OhmLawLab();
    }
}