package Lesson_8;

import java.util.Random;

public class Robot implements Runnable {

    Random random = new Random();

    private int runSpeed = (random.nextInt(250) + 350);
    private int jumpHeight = (random.nextInt(2) + 2);


    @Override
    public void jumpWall(ObstaclesLine wall) {
        System.out.println(wall);
        System.out.println("Бегун Robot прыгает");
        wall.runObstacles(this.jumpHeight);
    }

    @Override
    public void runTrack(ObstaclesLine track) {
        System.out.println(track);
        System.out.println("Бегун Robot бежит");
        track.runObstacles(this.runSpeed);
    }

    @Override
    public String toString() {
        return "Robot runner: run speed - " + this.runSpeed + ", jump height - " + this.jumpHeight + ".";
    }


}
