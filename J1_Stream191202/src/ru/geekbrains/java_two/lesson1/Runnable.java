package ru.geekbrains.java_two.lesson1;

@FunctionalInterface
public interface Runnable {
    void run();
    default void superRun(int len){
        System.out.println("Super run!!! " + len + " meter");
    }
}
