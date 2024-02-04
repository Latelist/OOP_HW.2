package Homework.Obstacles;

import java.util.Random;

/**
 * Класс препятствия которое может быть как для бега, так и для прыжка.
 */
public class Obstacle {
    public JumpObstacle jumpObstacleType; // Тип препятствия для прыжка
    public RunObstacle runObstacleType;   // Тип препятствия для бега

    public String obstName; // Название препятствия

    public int length = 0; // Длина препятствия (для бега)
    public int height = 0; // Высота препятствия (для прыжка)

    public boolean jump = false; // Флаг, указывающий, является ли препятствие препятствием для прыжка

    Random rand = new Random();

    /**
     * Конструктор класса Obstacle. Генерирует случайное препятствие для бега или прыжка.
     */
    public Obstacle() {
        int type = rand.nextInt(2);
        int randomIndex = 0;
        if (type == 0) {
            JumpObstacle[] toJump = JumpObstacle.values();
            randomIndex = rand.nextInt(toJump.length);
            jumpObstacleType = toJump[randomIndex];
            height = rand.nextInt(jumpObstacleType.getHeight());
            obstName = jumpObstacleType.getRuName();
            this.jump = true;
        } else {
            RunObstacle[] toRun = RunObstacle.values();
            randomIndex = rand.nextInt(toRun.length);
            runObstacleType = toRun[randomIndex];
            length = rand.nextInt(runObstacleType.getLength());
            obstName = runObstacleType.getRuName();
            this.jump = false;
        }
    }
}
