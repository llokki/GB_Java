package ru.geekbrains.java_two.lesson1.marathon.obstacle;

import ru.geekbrains.java_two.lesson1.marathon.competitors.Competitor;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
