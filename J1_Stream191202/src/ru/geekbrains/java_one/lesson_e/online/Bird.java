package ru.geekbrains.java_one.lesson_e.online;

public class Bird extends Animal {

    public Bird(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void voice() {
        System.out.println(name + " tweets!");
    }
}
