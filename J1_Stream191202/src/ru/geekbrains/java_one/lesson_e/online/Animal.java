package ru.geekbrains.java_one.lesson_e.online;

public abstract class Animal extends Object {
    String name;
    String color;
    int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void move() {
        System.out.println(name + " walks on paws");
    }

    public abstract void voice() ;
}
