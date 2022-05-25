package Lesson_8;

import java.util.Random;

public class Lesson_8Test {

    public static void main(String[] args) {

        ObstaclesLine[] line = ObstaclesLine.generateObstaclesLine();

        printLine(line);
        printRunners(createRunnersArray());
        ObstaclesLine.checkRunner(line, createRunnersArray());
    }


    static Runnable[] createRunnersArray() {
        Runnable[] runners = new Runnable[3];
        runners[0] = new Cat();
        runners[1] = new Man();
        runners[2] = new Robot();
        return runners;
    }

    static void printRunners(Runnable[] runners) {
        System.out.println("Группа бегунов:");
        for (Runnable runner : runners) {
            System.out.println(runner);
        }
        System.out.println("_________________");
    }

    static void printLine(ObstaclesLine[] line) {
        System.out.println("\nПолоса препятствий:");

        for (int i = 0; i < line.length; i++) {
            System.out.println(line[i]);
        }
        System.out.println("_________________");
    }

}
