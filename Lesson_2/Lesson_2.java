package Lesson_2;

public class Lesson_2 {
    public static void main(String[] args) {

        //doExercise5();




        //exercise6
        //int [] arrExercise6 = {2, 2, 2, 1, 2, 2, 10, 1}; //2, 2, 2, 1, 2, 2, || 10, 1
        //System.out.println(doExercise6 (arrExercise6));


    }

    //region exercise 1

    /** Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     *  С помощью цикла и условия заменить 0 на 1, 1 на 0;     */
    static void doExercise1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        printArray(arr);
    }
    //endregion

    //region exercise 2
    /**Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21*/
    static void doExercise2() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        printArray(arr);
    }
    //endregion

    //region exercise 3
    /**Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2*/
    static void doExercise3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        printArray(arr);
    }
    //endregion

    //region exercise 4

    /**Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/
    static void doExercise4() {
        int length = 7;
        int[][] arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][i] = 1;
                arr[i][arr.length-1-i] = 1;
                // Я знаю, что есть более изящная реализация - if (i==j || j == arr.length - i - 1) arr[i][j] = 1;
                // но я смог сделать только то, что выше
            }
        }
        printDoubleArray(arr);
    }
    //endregion

    //region exercise 5

    /** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)*/
    static void doExercise5 () {
        int[] arr = {-7, 5, 3, 2, 11, 4, 5, 1, 4, 8, 9};

        int max = arr[0];
        int maxIndex = 0;
        int min = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("максимальное значение " + max + " Индекс элемента - " + maxIndex);
        System.out.println("минимальное значение " + min + " Индекс элемента - " + minIndex);
    }
    //endregion

    // region exercise 6

    /**Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой и правой части массива равны.
     * Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
     * checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят
     */
    static boolean doExercise6 ( int[] array){
        int sumLeft = 0;
        int sumRight = 0;
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            sumRight += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            sumLeft += array[i];
            sumRight -= array[i];
            if (sumLeft == sumRight) {
                result = true;
                break;
            }
        }
        return result;
    }
    //endregion

    //region exercise 7

    /**Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
     * отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются
     * циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */
    static void doExercise7 (int[]array, int n) {


    }

   

    static void printArray (int [] array) {
        for (int arr: array) {
            System.out.print(arr + " ");
        }
    }

    static void printDoubleArray (int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

