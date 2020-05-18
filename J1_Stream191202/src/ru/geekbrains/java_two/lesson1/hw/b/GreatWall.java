package ru.geekbrains.java_two.lesson1.hw.b;

public class GreatWall extends Obstacles {
    private int height;

    public GreatWall(int height) {
        this.height = height;
    }

    @Override
    public void justDoIt(Competitor competitor) {
        competitor.jump(height);
    }
}
