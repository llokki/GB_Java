package ru.geekbrains.java_one.lesson_e.online;

public class SharkFromIkea extends Animal{
    public SharkFromIkea(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void move(){
        System.out.println(name + " shakes it's body");
    }

    @Override
    public void voice () {
        System.out.println(name + " om-nom-nom");
    }
}
