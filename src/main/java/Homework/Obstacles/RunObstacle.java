package Homework.Obstacles;

/**
 * Перечисление препятствий для бега и их длина.
 */
public enum RunObstacle {
    ROAD("дорогу", 400), STREET("улицу", 100),
    LANE("переулок", 50),
    FIELD("поле", 600), SQUARE("площадь", 200);

    private String ruName;
    private int length;

    /**
     * Конструктор для препятствия с заданным русским названием и длиной.
     *
     * @param ruName Русское название препятствия.
     * @param length Длина препятствия в метрах.
     */
    RunObstacle(String ruName, int length) {
        this.ruName = ruName;
        this.length = length;
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
     * Получить длину препятствия.
     *
     * @return Длина препятствия в метрах.
     */
    public int getLength() {
        return length;
    }
}
