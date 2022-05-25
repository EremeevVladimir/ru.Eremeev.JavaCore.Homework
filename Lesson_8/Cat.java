package Lesson_8;

import java.util.Random;

public class Cat implements Runnable {
    Random random = new Random();
    private int runSpeed = (random.nextInt(350) + 500);
    private int jumpHeight = (random.nextInt(3) + 3);

    @Override
    public void jumpWall(ObstaclesLine wall) {
        System.out.println(wall);
        System.out.println("Бегун Cat прыгает");
        wall.runObstacles(this.jumpHeight);
    }

    @Override
    public void runTrack(ObstaclesLine track) {
        System.out.println(track);
        System.out.println("Бегун Cat бежит");
        track.runObstacles(this.runSpeed);
    }
    @Override
    public String toString() {
        return "Cat runner: run speed - " + this.runSpeed + ", jump height - " + this.jumpHeight + ".";
    }

}
