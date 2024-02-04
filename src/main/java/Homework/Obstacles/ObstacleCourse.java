package Homework.Obstacles;

import Homework.Obstacles.Obstacle;

import java.util.ArrayList;

/**
 * Класс полосы препятствий.
 */
public class ObstacleCourse {
    public ArrayList<Obstacle> obstacles = new ArrayList<>();

    /**
     * Конструктор класса ObstacleCourse. Создает полосу препятствий заданной длины.
     *
     * @param length Длина полосы препятствий (количество препятствий).
     */
    public ObstacleCourse(int length) {
        for (int i = 0; i < length; i++) {
            Obstacle obstacle = new Obstacle();
            obstacles.add(obstacle);
        }
    }
}
