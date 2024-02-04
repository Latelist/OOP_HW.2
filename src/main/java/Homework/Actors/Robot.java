package Homework.Actors;

import Homework.Actors.Actor;

/**
 * Класс робота, наследуется от базового класса Actor.
 */
public class Robot extends Actor {

    /**
     * Конструктор класса Robot с параметром.
     *
     * @param name Имя робота.
     */
    public Robot(String name) {
        super(name);
        maxJumpHeight = 10;
        maxRunDistance = 2000;
    }

    /**
     * Конструктор класса Robot по умолчанию. Устанавливает имя робота как "Robot_X", где X - уникальный идентификатор.
     */
    public Robot() {
        this(String.format("Robot_%d", id++));
    }

    /**
     * Сообщить о результате бега робота.
     *
     * @param isActive      Флаг, указывающий, активен ли робот.
     * @param runDistance   Дистанция, на которую бежит робот.
     * @param obstacleName  Название препятствия.
     * @return Строковое сообщение о результате бега робота.
     */
    @Override
    public String runResultMessage(boolean isActive, int runDistance, String obstacleName) {
        if (isActive) {
            return "Робот " + name + " пробежал " + runDistance
                    + " метров через " + obstacleName + ".";
        } else {
            return "Робот " + name + " не смог пробежать " + runDistance
                    + " метров через " + obstacleName + " и сломался.\n";
        }
    }

    /**
     * Сообщить о результате прыжка робота.
     *
     * @param isActive      Флаг, указывающий, активен ли робот.
     * @param jumpHeight    Высота, на которую прыгает робот.
     * @param obstacleName  Название препятствия.
     * @return Строковое сообщение о результате прыжка робота.
     */
    @Override
    protected String jumpResultMessage(boolean isActive, int jumpHeight, String obstacleName) {
        if (isActive) {
            return "Робот " + name + " перепрыгнул " + obstacleName + " высотой " + jumpHeight +
                    " метров.";
        } else {
            return "Робот " + name + " не смог перепрыгнуть " +  obstacleName + " высотой "
                    + jumpHeight + " метров и вышел из строя. \n";
        }
    }
}
