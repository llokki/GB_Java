package ru.geekbrains.java_one.lesson_e.online;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void voice() {
        System.out.println(name + " barks!");
    }
}
