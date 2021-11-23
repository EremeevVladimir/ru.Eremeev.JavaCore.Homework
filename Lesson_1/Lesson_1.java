package Lesson_1;

public class Lesson_1 {
    public static void main(String[] args) {

        //region exercise 2
        /**  Создать переменные всех пройденных типов данных и инициализировать их значения.
         */
        byte a = 124;
        short b = -2768;
        int c = 0;
        long d = 124l;
        float e = -124.25f;
        double f = 124124.124;
        char g = 'r';
        char h = 124;
        boolean i = true;

        //endregion

        System.out.println(doExercise3(10, 122.11f, 11.1f, 2f));
        System.out.println(doExercise4(5, 4));
        doExercise5(9);
        System.out.println(doExercise6(0));
        doExercise7("Vasily");
        doExercise8(1860);

    }

    //region exercise 3
    /** Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     * где a, b, c, d – аргументы этого метода, имеющие тип float.
     */
    static float doExercise3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    //endregion

    //region exercise 4
    /** Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в
     * пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
     */
    static boolean doExercise4(int a, int b) {
        if (a + b > 9 || a + b < 21) {
            return true;
        }
        return false;
    }
    //endregion

    //region exercise 5
    /**Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
     в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */

    static void doExercise5 (int a) {

        System.out.println(a>=0 ? a + " - число положительное" : a + " - число отрицательное");
    }
    //endregion

    //region exercise 6
    /** Написать метод, которому в качестве параметра
     *      передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    static boolean doExercise6 (int a) {

        return a < 0 ? true : false; //0 (ноль), в соответствии с условием задачи 5, я посчитал положительным числом.

    }
    //endregion

    //region exercise 7
    /**
     * Написать метод, которому в качестве параметра передается строка, обозначающая имя.
     Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */
    static void doExercise7 (String name) {
        System.out.println("Hello " + name);
    }
    //endregion

    //region exercise 8
    /** Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    static void doExercise8 (int year) {
        System.out.println(year % 400 == 0 || (year % 4 == 0 & year % 100 != 0 )? year + " - leap year": year + " - not leap year");
    }
    //endregion

}
