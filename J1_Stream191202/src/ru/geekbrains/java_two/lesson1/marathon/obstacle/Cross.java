package ru.geekbrains.java_two.lesson1.marathon.obstacle;

import ru.geekbrains.java_two.lesson1.marathon.competitors.Competitor;

public class Cross extends Obstacle {
    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(dist);
    }
}
