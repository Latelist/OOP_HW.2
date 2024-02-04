package Homework;

import Homework.Actors.*;
import Homework.Obstacles.*;

import java.util.ArrayList;

/**
 * Субъекты проходят полосу препатствий.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Actor> actors = new ArrayList<>();
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        actors.add(cat);
        actors.add(human);
        actors.add(robot);

        ObstacleCourse obstacleCourse = new ObstacleCourse(5);
        int counter = 0;

        // Субъекты проходят препятствия
        for (Actor actor : actors) {
            for (Obstacle obstacle : obstacleCourse.obstacles) {
                if (actor.getIsActive() && obstacle.jump) {
                    actor.jump(obstacle);
                } else if (actor.getIsActive() && !obstacle.jump) {
                    actor.run(obstacle);
                }
            }
            System.out.println();
        }

        // Вывод статуса актеров
        for (Actor actor : actors) {
            actor.getStatus();
        }
    }
}
