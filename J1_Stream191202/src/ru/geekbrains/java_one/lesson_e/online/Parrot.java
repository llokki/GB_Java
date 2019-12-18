package ru.geekbrains.java_one.lesson_e.online;

public class Parrot extends Bird {
    public Parrot(String name, String color, int age, int hieght){
        super(name, color, age, hieght);
    }

    void speak() {
        System.out.println("Polly wanna craker");
    }

//    public void fly() {
//        System.out.println(name + " eats");
//    }
}
