package lesson4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, HashSet<String>> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add(String lastName, String phoneUser) {
        HashSet<String> numbers;
        if (book.containsKey(lastName)) {
            numbers = book.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneUser);
        book.put(lastName, numbers);
    }

    Set<String> getLastName(String lastName) {
        if (book.containsKey(lastName)) {
            return book.get(lastName);
        } else {
            System.out.println(String.format("В справочнике нет записи для ", lastName));
            return new HashSet<>();
        }
    }
}
