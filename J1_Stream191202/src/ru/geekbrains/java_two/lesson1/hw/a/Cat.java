package ru.geekbrains.java_two.lesson1.hw.a;

import ru.geekbrains.java_two.lesson1.hw.b.Competitor;

public class Cat implements Runnable,Jumpable, Competitor {
    private String name;

    private int maxRunDist;
    private int maxJumpHeight;

    private boolean onDistance;

    public Cat(String name, int maxRunDist, int maxJumpHeight) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Cat(String name) {
        this(name, 1000, 4);
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " прыгает на " + height + " метров");
        } else {
            System.out.println(name + " не способен перепрыгнуть " + height + " метров");
            onDistance = false;
        }
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDist) {
            System.out.println(name + " спокойно бежит " + dist + " метров");
        } else {
            System.out.println(name + " не в силах пробежать " + dist + " метров");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {return onDistance; }

    @Override
    public void status() {
        System.out.println(name + " " +
                (onDistance? " На дистанции" : " Выбыл из соревнований"));
    }
}
