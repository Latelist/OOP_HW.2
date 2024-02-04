package Homework.Actors;

import Homework.Actors.Actor;
import Homework.Obstacles.Obstacle;

/**
 * Класс кота, наследуется от базового класса Actor.
 */
public class Cat extends Actor {

    /**
     * Конструктор класса Cat с параметром.
     *
     * @param name Имя кота.
     */
    public Cat(String name) {
        super(name);
        maxRunDistance = 50;
        maxJumpHeight = 2;
    }

    /**
     * Конструктор класса Cat по умолчанию. Устанавливает имя кота как "Cat_X", где X - уникальный идентификатор.
     */
    public Cat() {
        this(String.format("Cat_%d", id++));
    }

    /**
     * Сообщить о результате бега кота.
     *
     * @param isActive      Флаг, указывающий, активен ли кот.
     * @param runDistance   Дистанция, на которую бежит кот.
     * @param obstacleName  Название препятствия.
     * @return Строковое сообщение о результате бега кота.
     */
    @Override
    public String runResultMessage(boolean isActive, int runDistance, String obstacleName) {
        if (isActive) {
            return "Кот " + name + " оголтело пронесся " + runDistance
                    + " метров через " + obstacleName + ".";
        } else {
            return "Кот " + name + " не смог пробежать " + runDistance
                    + " метров через " + obstacleName + " и сошел с дистанции.";
        }
    }

    /**
     * Сообщить о результате прыжка кота.
     *
     * @param isActive      Флаг, указывающий, активен ли кот.
     * @param jumpHeight    Высота, на которую прыгает кот.
     * @param obstacleName  Название препятствия.
     * @return Строковое сообщение о результате прыжка кота.
     */
    @Override
    protected String jumpResultMessage(boolean isActive, int jumpHeight, String obstacleName) {
        if (isActive) {
            return "Кот " + name + " перепрыгнул " + obstacleName + " высотой " + jumpHeight +
                    " метров.";
        } else {
            return "Кот " + name + " не смог запрыгнуть на " + obstacleName + " высотой "
                    + jumpHeight + " метров и сошел с дистанции.";
        }
    }
}
