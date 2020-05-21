package ru.geekbrains.java_two.lesson2;

/**
 * Данное исключение может быть вызвано когда у квадратного уравнения нет корней
 *
 * */
public class NoRootException extends RuntimeException{
    private double a;
    private double b;
    private double c;


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public NoRootException(String message, double a, double b, double c) {
        super(message);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
