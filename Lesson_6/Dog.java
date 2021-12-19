package Lesson_6;

public class Dog extends Animal {

    private final int RUNSPEEDMAX = 500;
    private final int SWEEMSPEEDMAX = 10;
    private static int dogId;

    {
        dogId +=1;
    }

    public Dog(String name) {
        super(name);
    }

    public static int getDogId() {
        return dogId;
    }

    @Override
    public void run(int obstacleLength) {
        int maxSpeed = RUNSPEEDMAX;
        System.out.println(name + " run " + speedCheckRun(obstacleLength, maxSpeed) + " meters");
    }

    @Override
    public void swim(int obstacleLength) {
        int maxSpeed = SWEEMSPEEDMAX;
        System.out.println(name + " swam " + speedCheckSwim(obstacleLength, maxSpeed) + " meters");
    }
}
