package lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] myArray = MyArray.getArray();
        System.out.println("Массив: " + Arrays.asList(myArray));
        MyArray.uniqueWords(myArray);
        MyArray.counterWords(myArray);


        PhoneBook PhoneBook = new PhoneBook();
        PhoneBook.add("Сидоров", "111111111");
        PhoneBook.add("Суворов", "222222222");
        PhoneBook.add("Иванов", "333333333");
        PhoneBook.add("Кукушкин", "444444444");
        PhoneBook.add("Зайко", "222222222");
        PhoneBook.add("Суворов", "555555555");

        System.out.println("Выводим номер телефона для Сидоров: " + PhoneBook.getLastName("Сидоров"));
        System.out.println("Выводим номер телефона для Суворов: " + PhoneBook.getLastName("Суворов"));
        System.out.println("Выводим номер телефона для Иванов: " + PhoneBook.getLastName("Иванов"));
        System.out.println("Выводим номер телефона для Кукушкин: " + PhoneBook.getLastName("Кукушкин"));
        System.out.println("Выводим номер телефона для Зайко: " + PhoneBook.getLastName("Зайко"));

    }
}
