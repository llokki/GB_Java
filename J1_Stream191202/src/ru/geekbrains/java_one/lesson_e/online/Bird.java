package ru.geekbrains.java_one.lesson_e.online;

public class Bird extends Animal {

    private int hieght;

    public Bird(String name, String color, int age, int hieght) {
        super(name, color, age);
        this.hieght = hieght;
    }

    @Override
    public void voice() {
        System.out.println(name + " tweets!");
    }

    public final void fly() {
        System.out.println(name + " flies!");
    }
}
