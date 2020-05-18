package ru.geekbrains.java_two.lesson1;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
//        Runnable cat = new Cat();
//        cat.run();
//
//        Runnable[] runnables = {
//                new Cat(),
//                new Dog(),
//                new Cat(),
//                new Dog(),
//        };
//
//        for (Runnable r : runnables) {
//            r.run();
//            r.superRun(5);
//
//        }
//
//
//        Cat cat1 = new Cat();
//
//        System.out.println(cat1 instanceof Runnable);
//
//        Dog dog = new Dog();
//        System.out.println(dog instanceof Jumpable);

        testRun(new Cat());
        testRun(new Kangaroo());

        testRun(()-> {
            System.out.println("Qwerty");
        });

        testRun(new Runnable() {
            @Override
            public void run() {
                System.out.println("new Runnable()") ;{
                }
            }
        });
    }

    static void testRun(Runnable r){
        r.run();
    }
}
