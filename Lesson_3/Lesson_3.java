package Lesson_3;


import java.util.Random;
import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args) {
        doExercise1Type2();

    }

    //region exercise 1
    /**
     * Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
     * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
     * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */


    static void doExercise1() { //все в одном методе без роверки корректности ввода
        // но вроде работает
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean play = true;
        while (play) {
            int rounds = 3;
            int number = random.nextInt(10);
            int counter = 0;

            System.out.println(" Угадайте число от 0 до 9, у вас " + rounds + " попытки");
            for (int i = 1; i <= rounds; i++) {
                System.out.println("Введите число");
                int userAnswer = scanner.nextInt();

                if (userAnswer == number) {
                    System.out.println("Поздравляю, вы угадали!");
                    break;
                } else {
                    counter += 1;
                    if (rounds == counter) {
                        System.out.println("ваши попытки закончились, вы проиграли");
                        break;
                    }
                    if (userAnswer > number) {
                        System.out.println("Ваш ответ больше загаданного числа");
                    } else if (userAnswer < number) {
                        System.out.println("Ваш ответ меньше загаданного числа");
                    }

                }
                if (counter < rounds) {
                    System.out.println("Попробуйте еще раз");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int answerPlay = scanner.nextInt();
            if (answerPlay == 0) {
                play = false;
            }
        }


    }

    static void doExercise1Type2() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean nextGame;


        do {
            int randNumber = random.nextInt(10);
            System.out.println("Отгадайте число от 0 до 9. Будьте аккуратны, у вас всего 3 попытки ");

            playGame(randNumber);

            System.out.println("Вы хотите попробовать еще? если да, нажмите 1, если нет, введите любое число");
            nextGame = scanner.nextInt() == 1;

        } while (nextGame);
    }

    static void playGame(int randNumber) {

        int counter = 0;
        do {
            int userAnswer = getNumberFromScanner("Введите число от 0 до 9", 0, 9);

            if (userAnswer == randNumber) {
                System.out.println("Поздравляю, вы победили! Рандомное число = " + randNumber);
                break;
            }
            if (userAnswer < randNumber) {
                System.out.println("Ваше число меньше рандомного");
            } else if (userAnswer > randNumber) {
                System.out.println("Ваше число больше рандомного");
            }
            counter++;

        } while (counter < 3);
    }



    static int getNumberFromScanner(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);

        int x;
        do {
            System.out.println(message);
            x = scanner.nextInt();
        }
        while (x < min || x > max);
        return x;
    }
 //endregion




}

