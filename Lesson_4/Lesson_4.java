package Lesson_4;

import java.util.Random;
import java.util.Scanner;


public class Lesson_4 {
    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;
    static char[][] map = new char[SIZE][SIZE];
    static final char DOT_EMPTY = '·';
    static final char DOT_X = 'X';
    static final char DOT_O = '0';
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    //region exercise 2
 
    static boolean checkWin (char dotSymbol) {
        //4 группы циклов, 2 для проверки диагоналей, 1 для вертикалей и 1 для горизонталей.
        //Не смотря на то, что win condition завязан на переменную DOTS_TO_WIN, по факту этот метод не может
        // вычислять положение дополнительных выигрышных диагоналей. По этому не пригоден для использования на полях
        // у которых переменные DOTS_TO_WIN и SIZE не равны
        int checkLine = 0; //счетчик последовательности повторяющихся одинаковых символов
        ////группа 1 - check 1st diagonal
        for (int i = 0; i <SIZE; i++) {
            if (map[i][i] == dotSymbol) {
                checkLine++;
            }
            else {
                checkLine = 0;
            }
            if (checkLine == DOTS_TO_WIN) return true;

        }
        ////группа 2- check 2nd diagonal
        checkLine = 0; //перед стартом каждого блока сбрасываем значение счетчика
        for (int i = 0; i <SIZE; i++) {
            if (map[i][SIZE-1-i] == dotSymbol) {
                checkLine ++;
            }
            else {
                checkLine = 0;
            }
            if (checkLine == DOTS_TO_WIN) return true;
        }
        ////группа 3- check vertical
        for (int i = 0; i <SIZE; i++) {
            checkLine = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == dotSymbol) {
                    checkLine ++;
                }
                else {
                    checkLine = 0;
                }
                if (checkLine == DOTS_TO_WIN) return true;
            }
        }
        ////группа 4- check horizontal
        for (int i = 0; i <SIZE; i++) {
            checkLine = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dotSymbol) {
                    checkLine ++;
                }
                else {
                    checkLine = 0;
                }
                if (checkLine == DOTS_TO_WIN) return true;
            }
        }
        return false;
    }
    //endregion
    static boolean isMapFull () {
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j <SIZE; j ++){
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }


    static void aiTurn () { //Ход компьютера, генерирует случайные часли, взаимодействует с методом isCellValid
        // для проверки чисел
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map [x][y] = DOT_O;
    }
    static void humanTurn () {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;
        } while (!isCellValid (x,y));
        map [x][y] = DOT_X;
    }
    static boolean isCellValid (int x, int y) { //метод делает 2 проверки: 1) не выходит ли введенное значение за пределы массива;
        //    2) содержит ли ячейка значение DOT_EMPTY. Вызывается методами: human turn и aiTurn
        if (x<0 || x > SIZE || y < 0 || y > SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    static void initMap () {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j <map[i].length; j++) {
                map [i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap (){
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    static void playGame() {
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (checkWin(DOT_X)){
                System.out.println("You WIN!");
                break;
            }
            if (isMapFull()){
                System.out.println("Draw, no one win.");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)){
                System.out.println("Computer WIN");
                break;
            }
            if (isMapFull()){
                System.out.println("Draw, no one win.");
                break;
            }
        }
        System.out.println(" END of the game");

    }

    public static void main(String[] args) {
        playGame();

    }

}
