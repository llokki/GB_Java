package ru.geekbrains.java_two.lesson1.marathon.obstacle;

import ru.geekbrains.java_two.lesson1.marathon.competitors.Competitor;

public class Water extends Obstacle {
    private int dist;


    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(dist);
    }
}
