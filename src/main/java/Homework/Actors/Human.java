package Homework.Actors;

import Homework.Actors.Actor;

/**
 * Класс человека, наследуется от базового класса Actor.
 */
public class Human extends Actor {

    /**
     * Конструктор класса Human с параметром.
     *
     * @param name Имя человека.
     */
    public Human(String name) {
        super(name);
        maxRunDistance = 500;
        maxJumpHeight = 1;
    }

    /**
     * Конструктор класса Human по умолчанию. Устанавливает имя человека как "Human_X", где X - уникальный идентификатор.
     */
    public Human() {
        this(String.format("Human_%d", id++));
    }

    /**
     * Сообщить о результате бега человека.
     *
     * @param isActive      Флаг, указывающий, активен ли человек.
     * @param runDistance   Дистанция, на которую бежит человек.
     * @param obstacleName  Название препятствия.
     * @return Строковое сообщение о результате бега человека.
     */
    @Override
    public String runResultMessage(boolean isActive, int runDistance, String obstacleName) {
        if (isActive) {
            return "Человек " + name + " пробежал " + runDistance
                    + " метров через " + obstacleName + ".";
        } else {
            return "Человек " + name + " не смог пробежать " + runDistance
                    + " метров через " + obstacleName + " и сошел с дистанции. \n";
        }
    }

    /**
     * Сообщить о результате прыжка человека.
     *
     * @param isActive      Флаг, указывающий, активен ли человек.
     * @param jumpHeight    Высота, на которую прыгает человек.
     * @param obstacleName  Название препятствия.
     * @return Строковое сообщение о результате прыжка человека.
     */
    @Override
    protected String jumpResultMessage(boolean isActive, int jumpHeight, String obstacleName) {
        if (isActive) {
            return "Человек " + name + " ловко перепрыгнул " + obstacleName + " высотой " + jumpHeight +
                    " метров.";
        } else {
            return "Человек " + name + " не смог перепрыгнуть " +  obstacleName + " высотой "
                    + jumpHeight + " метров и сошел с дистанции. \n";
        }
    }
}
