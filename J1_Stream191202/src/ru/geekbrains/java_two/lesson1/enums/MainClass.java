package ru.geekbrains.java_two.lesson1.enums;

public class MainClass {
    public static void main(String[] args) {
        Planets planet = Planets.Earth;
        Planets planet1 = Planets.valueOf("Mars");

        System.out.println(planet1);

//        System.out.println(planet.compareTo(planet1) );
//        System.out.println(planet.ordinal());

        for (Planets p: Planets.values()) {
            System.out.println(p + " " + p.getSize());
        }

    }
}
