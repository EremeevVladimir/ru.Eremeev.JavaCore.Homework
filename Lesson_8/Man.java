package Lesson_8;

import java.util.Random;

public class Man implements Runnable {
    Random random = new Random();
    private int runSpeed = (random.nextInt(300) + 350);
    private int jumpHeight = (random.nextInt(2) + 2);


    @Override
    public void jumpWall(ObstaclesLine wall) {
        System.out.println(wall);
        System.out.println("Бегун Man прыгает");
        wall.runObstacles(this.jumpHeight);
    }

    @Override
    public void runTrack(ObstaclesLine track) {
        System.out.println(track);
        System.out.println("Бегун Man бежит");
        track.runObstacles(this.runSpeed);

    }
    @Override
    public String toString() {
        return "Man runner: run speed - " + this.runSpeed + ", jump height - " + this.jumpHeight + ".";
    }
}
