package Lesson_6;

public class Cat extends Animal {

    private final int RUNSPEEDMAX = 200;
    private static int catId;

    {
        catId +=1;
    }

    public Cat(String name) {
        super(name);
    }

    public static int getCatId() {
        return catId;
    }

    @Override
    public void run(int obstacleLength) {
        int maxSpeed = RUNSPEEDMAX;
        System.out.println(name + " run " + speedCheckRun(obstacleLength, maxSpeed) + " meters");
    }


    @Override
    public void swim(int obstacleLength) {
        System.out.println("Cats can't swim");
    }
}
