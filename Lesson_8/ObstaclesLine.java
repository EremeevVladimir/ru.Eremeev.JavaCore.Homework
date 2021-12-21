package Lesson_8;

import java.util.Random;


public abstract class ObstaclesLine {
    private static Random random = new Random();


     public abstract void setSuccess(boolean success);

    public abstract boolean getSuccess();

    //region ObstaclesLine creation methods

    private static ObstaclesLine generateObstacle() {
        Random random = new Random();
        int switchOperator = random.nextInt(2);
        return switchOperator == 0 ? Wall.generateWall() : RunningTrack.generateTrack();
    }

    public static ObstaclesLine[] generateObstaclesLine() {
        int length = (random.nextInt(3) + 4);
        ObstaclesLine[] obstaclesLine = new ObstaclesLine[length];

        for (int i = 0; i < obstaclesLine.length; i++) {
            obstaclesLine[i] = generateObstacle();
        }
        return obstaclesLine;
    }
    //endregion

    //region compare methods
    public static void checkRunner(ObstaclesLine[] line, Runnable[] runners) {
        for (int i = 0; i < runners.length; i++) {


            for (int j = 0; j < line.length; j++) {

                if (line[j] instanceof Wall) {
                    runners[i].jumpWall(line[j]);
                } else if (line[j] instanceof RunningTrack) {
                    runners[i].runTrack(line[j]);
                } else System.out.println("Бегун скрылся в кустах");//а вдруг
                if (line[j].getSuccess() == false) {
                    System.out.println("Бегун сошел с дистанции");
                    line[j].setSuccess(true);
                    break;
                }
            }
            System.out.println("_________________");
        }
    }


    public abstract void runObstacles(int param);
//endregion

}
