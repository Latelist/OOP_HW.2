package Homework.Obstacles;

import java.util.Random;

/**
 * Перечисление препятствий для прыжков и их высота.
 */
public enum JumpObstacle {
    CAR("машину", 2), WALL("стену", 3),
    BARRIER("шлагбаум", 1),
    GRANNY("бабушку", 1), CHILD("ребенка", 2),
    FENCE("забор", 2);

    private final String ruName;
    private final int height;

    /**
     * Конструктор для препятствия с заданным русским названием и высотой.
     *
     * @param ruName Русское название препятствия.
     * @param height Высота препятствия в метрах.
     */
    JumpObstacle(String ruName, int height) {
        this.ruName = ruName;
        this.height = height;
    }

    /**
     * Получить русское название препятствия.
     *
     * @return Русское название препятствия.
     */
    public String getRuName() {
        return ruName;
    }

    /**
     * Получить высоту препятствия.
     *
     * @return Высота препятствия в метрах.
     */
    public int getHeight() {
        return height;
    }
}
