package Lesson_7;

public class CatAndPlateTestDrive {
    public static void main(String[] args) {
        Plate plate = new Plate(50, 100);

        Cat [] cats = new Cat[4];
        cats[0] = new Cat("Barsik", 15);
        cats[1] = new Cat("Vaska", 17);
        cats[2] = new Cat("Mursik", 21);
        cats[3] = new Cat("Monster", 23);

        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
        }
        for (Cat cat:cats) {
            cat.feedInfo();
        }
        plate.info();
        System.out.println("Add some food to the plate (+50)");
        plate.addFood(50);
        plate.info();
        System.out.println("Add some food to the plate (+100)");
        plate.addFood(100);
        plate.info();


    }
}
