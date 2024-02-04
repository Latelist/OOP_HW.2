package Homework.Actors;

import Homework.Obstacles.Obstacle;

/**
 * Класс действующего субъекта. Может преодолевать препятствия.
 */
public abstract class Actor {
    /**
     * Имя субъекта.
     */
    protected String name;

    /**
     * Уникальный идентификатор субъекта.
     */
    protected static int id = 0;

    /**
     * Максимальная дистанция бега субъекта.
     */
    protected int maxRunDistance;

    /**
     * Максимальная высота прыжка субъекта.
     */
    protected int maxJumpHeight;

    /**
     * Статус субъекта: активный или нет.
     */
    private boolean isActive;

    /**
     * Конструктор класса Actor.
     *
     * @param name Имя актера.
     */
    public Actor(String name) {
        this.name = name;
        isActive = true;
    }

    /**
     * Бежать через препятствие.
     *
     * @param obstacle Препятствие, которое актер должен преодолеть.
     */
    public void run(Obstacle obstacle) {
        if (obstacle.length > maxRunDistance) {
            isActive = false;
        }
        System.out.println(runResultMessage(isActive, obstacle.length, obstacle.obstName));
    }

    /**
     * Прыгать через препятствие.
     *
     * @param obstacle Препятствие, которое актер должен преодолеть.
     */
    public void jump(Obstacle obstacle) {
        if (obstacle.height > maxJumpHeight) {
            isActive = false;
        }
        System.out.println(jumpResultMessage(isActive, obstacle.height, obstacle.obstName));
    }

    /**
     * Получить результат бега.
     *
     * @param isActive     Флаг активности актера.
     * @param runDistance  Дистанция бега.
     * @param obstacleName Название препятствия.
     * @return Сообщение о результате бега.
     */
    protected abstract String runResultMessage(boolean isActive, int runDistance, String obstacleName);

    /**
     * Получить результат прыжка.
     *
     * @param isActive     Флаг активности актера.
     * @param jumpHeight   Высота прыжка.
     * @param obstacleName Название препятствия.
     * @return Сообщение о результате прыжка.
     */
    protected abstract String jumpResultMessage(boolean isActive, int jumpHeight, String obstacleName);

    /**
     * Получить статус субъекта (прошел препятствия или нет).
     */
    public void getStatus() {
        if (isActive) {
            System.out.println(name + " прошел полосу препятствий.");
        } else {
            System.out.println(name + " не прошел полосу препятствий и грустно идет бухать.");
        }
    }

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setName(String name) {
        this.name = name;
    }
}

