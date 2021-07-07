package ru.geekbrains.java_one.lesson_d.online;

public class Cat {
    private String name;
    private String color;
    private int age;
    private int birthYear;

    public String getColor() {
        return color;
    }

    public void setName(String name){
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public int getAge() {
        return 2019 - birthYear;
    }

    private void setAge(int age) {
        this.birthYear = 2019 - age;
    }

    public static final int pawsAmount = 4;
    private static double stomachVolume = 100;

    public Cat() { setAge(0); }

    public Cat(String name, String color) {
        this();
        this.name = name;
        this.color = color;
        this.voice();
    }

    public Cat(String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }

    public static void voice() {
        System.out.println( "Meows!");
    }

    public void jump() {
        if(getAge() < 5){
            System.out.println(name + " jump");
        }
    }

}
