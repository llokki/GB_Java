package ru.geekbrains.java_one.lesson_e.online;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Barsik" , "Black", 3);
        Dog d = new Dog("Sharik" , "white", 4);
        Bird b = new Bird("Karkoosha", "Grey", 1);

    }

    private static void typecasting() {
        //typecast

        byte b = 10; // 1 byte
        int i = b; // 4 byte
        short s =(short) i;// 2 byte
    }
}