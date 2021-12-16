package Lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean feed = false;

    //region constructors, setters, getters
    public Cat() {
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        if (appetite > 0) this.appetite = appetite;
        else this.appetite = 1;
    }

    //endregion

    //region methods
    public void eat(Plate plate) {
        //проверка будет "есть" кот или нет фактически не выполняется, метод eat работает всегда
        // если еды в тарелке меньше, чем надо коту, изменения стостояний кота и
        // тарелки не происходит

        feed = plate.decreaseFood(appetite);
    }

    public void feedInfo() {
        System.out.println("Cat: " + name + " has been fed: " + feed);
    }

    //endregion
}
