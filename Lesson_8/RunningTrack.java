package Lesson_8;

import java.util.Random;


public class RunningTrack extends ObstaclesLine {
    private static Random random = new Random();
    private int length = (random.nextInt(201) + 300);
    private boolean success = true;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public boolean getSuccess() {
        return success;
    }

    @Override
    public void runObstacles(int runnerSpeed) {
        if (runnerSpeed >= this.length) {
            System.out.println("Пробежал");

        } else {
            System.out.println("Не смог пробежать");
            success = false;
        }
    }

    public static RunningTrack generateTrack() {
        return new RunningTrack();
    }

    @Override
    public String toString() {
        return "Препятствие беговая дорожка, длинной: " + this.length + "; ";
    }
}
