package ru.geekbrains.java_two.lesson1.hw.a;

import ru.geekbrains.java_two.lesson1.hw.b.Competitor;
import ru.geekbrains.java_two.lesson1.hw.b.GreatWall;
import ru.geekbrains.java_two.lesson1.hw.b.Obstacles;
import ru.geekbrains.java_two.lesson1.hw.b.Treadmill;

public class MainA {
    public static void main(String[] args) {
//        Human human = new Human();
//        human.jump();
//        human.run();
//
//        Cat cat = new Cat();
//        cat.jump();
//        cat.run();
//
//        Robot robot = new Robot();
//        robot.jump();
//        robot.run();
        // конец первого задания

        Competitor [] competitors = {
                new Human("Адам"),
                new Cat("Бегемот"),
                new Robot("R2D2")
        };

        Obstacles [] obstacles = {
                new Treadmill(5000),
                new GreatWall(200)
        };


        for (Competitor c: competitors) {
            for (Obstacles o: obstacles) {
                o.justDoIt(c);
                if(!c.isOnDistance()) {
                    break;
                }
            }
        }

        for(Competitor c: competitors) {
            c.status();
        }
    }
}
