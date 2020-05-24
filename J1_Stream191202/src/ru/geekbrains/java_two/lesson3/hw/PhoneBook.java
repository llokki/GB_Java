package ru.geekbrains.java_two.lesson3.hw;

import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> pb = new HashMap<>();
    private List<String> numbers_list;

    public void add(String name, String number) {
        if(pb.containsKey(name)) {
            numbers_list = pb.get(name);
            numbers_list.add(number);
            pb.put(name,numbers_list);
        } else {
            numbers_list = new ArrayList<>();
            numbers_list.add(number);
            pb.put(name, numbers_list);
        }
    }

    public List<String> get(String name) {
        return pb.get(name);
    }
}






