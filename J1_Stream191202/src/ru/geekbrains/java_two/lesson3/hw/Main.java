package ru.geekbrains.java_two.lesson3.hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String [] string = {"январь","февраль", "март","апрель","январь", "март","апрель","январь","февраль", "март","апрель"};

        Map<String, Integer> hM = new HashMap<>();

        for (String s: string) {
            Integer count = hM.get(s);
            hM.put(s, count == null ? 1 : count + 1);
        }
//        System.out.println(hM);


        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("John", "45678");
        phoneBook.add("John", "987654");
        phoneBook.add("Loki", "9876");
        phoneBook.add("Tor", "3456");


        System.out.println(phoneBook.get("John"));

        }
    }

