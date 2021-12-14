package Lesson_6;

public class AnimalTestDrive {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Mursik");
        cat1.swim(5);
        cat2.run(70);

        Dog dog1 = new Dog("Sharick");
        dog1.run(700);
        dog1.swim(5);

        Animal.getStatistic();



    }

}
