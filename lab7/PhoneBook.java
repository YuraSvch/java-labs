package lab7;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        // Створюємо HashMap: Ключ - String, Значення - String
        HashMap<String, String> contacts = new HashMap<>();

        // Додаємо 10 контактів через put() 
        contacts.put("Shevchenko", "+380671111111");
        contacts.put("Bondar", "+380672222222");
        contacts.put("Tkachenko", "+380673333333");
        contacts.put("Kovalenko", "+380674444444");
        contacts.put("Oliynyk", "+380675555555");
        contacts.put("Moroz", "+380676666666");
        contacts.put("Lysenko", "+380677777777");
        contacts.put("Petrenko", "+380678888888");
        contacts.put("Savchenko", "+380679999999");
        contacts.put("Yurchenko", "+380670000000");

        // Виведення через цикл keySet() 
        System.out.println("Список контактів:");
        for (String surname : contacts.keySet()) {
            System.out.println("Прізвище: " + surname + ", Номер: " + contacts.get(surname));
        }

        // Пошук за прізвищем через get() 
        String searchSurname = "Bondar";
        if (contacts.containsKey(searchSurname)) {
            System.out.println("Знайдено номер для " + searchSurname + ": " + contacts.get(searchSurname));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        // Видалення та перевірка розміру 
        contacts.remove("Moroz");
        System.out.println("Кількість записів після видалення: " + contacts.size());
    }
}