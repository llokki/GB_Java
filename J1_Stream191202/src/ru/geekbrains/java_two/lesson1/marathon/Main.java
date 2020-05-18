package ru.geekbrains.java_two.lesson1.marathon;

import ru.geekbrains.java_two.lesson1.marathon.competitors.Cat;
import ru.geekbrains.java_two.lesson1.marathon.competitors.Competitor;
import ru.geekbrains.java_two.lesson1.marathon.competitors.Dog;
import ru.geekbrains.java_two.lesson1.marathon.competitors.Human;
import ru.geekbrains.java_two.lesson1.marathon.obstacle.Cross;
import ru.geekbrains.java_two.lesson1.marathon.obstacle.Obstacle;
import ru.geekbrains.java_two.lesson1.marathon.obstacle.Wall;
import ru.geekbrains.java_two.lesson1.marathon.obstacle.Water;

public class Main {
    public static void main(String[] args) {
        Competitor [] competitors = {
                new Human("Bob"),
                new Cat("Bars"),
                new Dog("Tuzik"),
                new Human("John Connor", 10000, 2000, 0)
        };

        Obstacle [] obstacles = {
                new Cross(500),
                new Water(100),
                new Wall(1)
        };

        for (Competitor c: competitors) {
            for (Obstacle o: obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()) {
                    break;
                }
            }
        }
        for (Competitor c: competitors) {
            c.info();
        }

    }
}
