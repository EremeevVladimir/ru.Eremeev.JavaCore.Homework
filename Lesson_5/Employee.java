package Lesson_5;

public class Employee {
    private String fullName;

    private String position;
    private String email;
    private int telephone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, int telephone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

   void filterEmployeeByAge_Older ( int age) {
            if (this.age >age) {
                printEmployeeFullInfo();
            }

        }
    //все выводимые значения будут приравнены к строкам, что в нашем случае ни на что не влияет,
    // поскольку мы эти даные дальше никак не используем
    void printEmployeeFullInfo (){
        System.out.printf("Сотрудник - %s, должность - %s, e_mail - %s, телефон - %s, зарплата - %s, возраст - " +
                "%s\n", fullName, position, email, telephone, salary, age) ;
    }
}
