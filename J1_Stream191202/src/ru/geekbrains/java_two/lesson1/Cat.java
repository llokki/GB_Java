package ru.geekbrains.java_two.lesson1;

public class Cat implements Runnable, Jumpable {

    @Override
    public void run() {
        System.out.println("Cat run...");
    }

    @Override
    public void superRun(int len) {
        System.out.println("Cat " + len + " meter run");
    }

    @Override
    public void jump() {
        System.out.println("Cat jump...");
    }
}
