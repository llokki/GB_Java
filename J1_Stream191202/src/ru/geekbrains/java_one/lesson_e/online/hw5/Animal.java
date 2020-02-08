package ru.geekbrains.java_one.lesson_e.online.hw5;

public class Animal {
    String name;
    int s_lenght;
    int lenght;
    int hieght;
    int maxs_lenght;
    int maxlenght;
    int maxhieght;

    public Animal (String name, int s_lenght, int lenght, int hieght, int maxs_lenght, int maxlenght, int maxhieght){
        this.name = name;
        this.hieght = hieght;
        this.lenght = lenght;
        this.s_lenght = s_lenght;
        this.maxhieght = maxhieght;
        this.maxlenght = maxlenght;
        this.maxs_lenght = maxs_lenght;
    }

    public void swim (int s_lenght) {
        if (s_lenght >= maxs_lenght){
            System.out.println(name + " swim");
        } else {
            System.out.println(name + "Dont swim");
        }
    }
    public void run (int lenght) {
        if (lenght >= maxlenght){
            System.out.println(name + " run");
        } else {
            System.out.println(name+ " not running");
        }
    }
    public void jump (int hieght) {
        if (hieght >= maxhieght){
            System.out.println(name +" jump");
        } else {
            System.out.println(name+ "Dont jump");
        }
    }


}
