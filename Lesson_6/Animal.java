package Lesson_6;

public class Animal {
    /**
     * Допускаю, что можно было правилдьнее сделать задание с оператором Instanceof
     * но у меня получилось пока только так.
     */
    protected String name;
    private int runSpeedMax;
    private int swimSpeedMax;
    private static int animalId;


    {
        animalId += 1;

    }


    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void run(int obstacleLength) {
        int maxSpeed = runSpeedMax;
        System.out.println(name + " run " + speedCheckRun(obstacleLength, maxSpeed) + " meters");
    }

    public int speedCheckRun(int obstacleLength, int maxSpeed) {

        if (obstacleLength > maxSpeed) return maxSpeed;
        else return obstacleLength;
    }

    public void swim(int obstacleLength) {
        int maxSpeed = swimSpeedMax;
        System.out.println(name + " swam " + speedCheckSwim(obstacleLength, maxSpeed) + "meters");
    }

    public int speedCheckSwim(int obstacleLength, int maxSpeed) {
        if (obstacleLength > maxSpeed) return maxSpeed;
        else return obstacleLength;
    }

    static public void getStatistic () {
        System.out.println("Всего создано animals: " + animalId);
        System.out.println("В том чиле собак: " + Dog.getDogId());
        System.out.println("В том чиле кошек: " + Cat.getCatId());

    }

}





