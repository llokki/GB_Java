package ru.geekbrains.java_two.lesson1;

public class Kangaroo implements SuperJumpable{
    @Override
    public void jump() {
        System.out.println("Kangaroo jump...");
    }

    @Override
    public void superJump() {
        System.out.println("Kangaroo Super !!! jump!!!");
    }

    @Override
    public void run() {
        System.out.println("Kangaroo run");
    }

}
