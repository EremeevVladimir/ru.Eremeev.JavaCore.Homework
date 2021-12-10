package Lesson_5;

public class Main {
    // в этой реализации мне не нравитсято то, что у меня фактически 2 метода filter, первый перебирает массив,
    // и вызывает второй метод, для каждого элемента массива, который уже сравнивает параметр age с заданным числом,
    // оперируя полями класса. Обработать массив и сравнить данные в одном методе у меня не получилось, потому что
    // статический метод не имеет,как я понял, доступа к полям объекта, что логично, а что бы выбрать не статический
    // метод, нужен объект, а для этого его нужно извлечь из массива.



    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иванов Иван Иванович", "Водитуль", "ivanov@mail.ru", 000000000, 1000, 35);
        employees[1] = new Employee("Петров Петр Петрович", "Охранник", "petrov@mail.ru", 000000000, 800, 53);
        employees[2] = new Employee("Сидоров Сидор Сидорович", "Повар", "sidorov@mail.ru", 000000000, 1000, 41);
        employees[3] = new Employee("Петрова Иванна Сидоровна", "Секретарь", "petrovais@mail.ru", 000000000, 8000, 25);
        employees[4] = new Employee("Михайлов Михаил Михайлович", "Директор", "mdir@mail.ru", 000000000, 2000, 52);

        filter(employees, 40);
    }


   static void filter (Employee [] employees, int age) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].filterEmployeeByAge_Older(age);
        }
    }


}
