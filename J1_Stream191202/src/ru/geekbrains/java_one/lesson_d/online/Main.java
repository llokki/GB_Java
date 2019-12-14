package ru.geekbrains.java_one.lesson_d.online;

public class Main {

    private static class Dog {
        String color;
    }

    public static void main(String[] args) {
        int [] arr = new int[5];

        Cat c0 = new Cat("Barsik", "Black");
        Cat c1 = new Cat("Murzik" , "Red", 1);
        Dog d0 = new Dog();
        d0.color = c0.getColor() + " and blue";
        System.out.println(d0.color);

//        Cat c2 = c0;
//        c2.age = 5;
//
//        System.out.println(c0.name + " " + c0.color + " " + c0.age);
        Cat.voice();
        System.out.println("All cats has " + Cat.pawsAmount + " paws");

        c0.jump();
        c1.jump();
    }
}

