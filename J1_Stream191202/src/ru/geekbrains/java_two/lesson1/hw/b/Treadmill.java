package ru.geekbrains.java_two.lesson1.hw.b;

public class Treadmill extends Obstacles {
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public void justDoIt(Competitor competitor) {
        competitor.run(dist);
    }
}
