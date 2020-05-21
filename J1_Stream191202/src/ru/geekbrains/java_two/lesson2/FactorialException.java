package ru.geekbrains.java_two.lesson2;

public class FactorialException extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }


    public FactorialException(int number) {
        this.number = number;
    }


    public FactorialException(String message, int number) {
        super(message);
        this.number = number;
    }
}
