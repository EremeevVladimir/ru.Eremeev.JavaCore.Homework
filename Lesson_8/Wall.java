package Lesson_8;

import java.util.Random;

public class Wall extends ObstaclesLine {
    private static Random random = new Random();

    private int height = (random.nextInt(3) + 2);
    private boolean success = true;


    @Override
    public void setSuccess(boolean success) {
        this.success=success;
    }

    @Override
    public boolean getSuccess() {
        return success;
    }

    @Override
    public void runObstacles(int jumpHeight) {
        if (jumpHeight >= this.height) {
            System.out.println("Перепрыгнул");
        } else {
            System.out.println("Не смог перепрыгнуть");
            success = false;
        }
    }

    public static Wall generateWall() {
        return new Wall();
    }

    @Override
    public String toString() {
        return "Препятствие стена, высотой: " + this.height + ";";
    }
}


