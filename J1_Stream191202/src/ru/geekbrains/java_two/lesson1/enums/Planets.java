package ru.geekbrains.java_two.lesson1.enums;

public enum Planets {
    Mercury(20), Venus(45), Earth(48), Mars(37),
    Jupiter(100), Saturn(89), Uranus(78), Neptune(69);

    private int size;

    Planets(int size) {
        this.size = size;
    }


    public int getSize() {
        return size;
    }
}
