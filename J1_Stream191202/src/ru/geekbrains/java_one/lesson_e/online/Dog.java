package ru.geekbrains.java_one.lesson_e.online;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(name + " barks!");
    }
}
