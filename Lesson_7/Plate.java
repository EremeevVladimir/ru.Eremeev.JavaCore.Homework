package Lesson_7;

public class Plate {
    private int food;
    private int foodLimit; //в задании этого нет, но то, что тарелка не бездонная, напрашивается лимит,
    // устанавливается только при создании. Лимит мне добавил кучу проверок в будущем, я даже пожалел потом

    //region constructors, setters, getters
    //конструктор не даст установить отрицательное значение количества еды и слишком маленькую тарелку
    public Plate(int food, int foodLimit) {
        this.food = checkFoodSetUp(food);

        if (foodLimit < 20) this.foodLimit = 20;
        else this.foodLimit = foodLimit;
    }


    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = checkFoodSetUp(food);

    }

    private int checkFoodSetUp(int food) {
        int foodResult;
        if (food >= 0) foodResult = food;
        else if (food > foodLimit) foodResult = food;
        else foodResult = 0;
        return foodResult;
    }


    //endregion

    //region methods
    public boolean decreaseFood(int appetite) {
        if ((food - appetite) >= 0) {
            food -= appetite;
            return true;
        }
        return false;
    }

    public void addFood (int food) {
        if (food > 0) {//если передаваемое значение меньше ноля, метод не делает ничего
          if ((food+this.food) > foodLimit) this.food = foodLimit;
          else this.food +=food;
         }
    }


    public void info() {
        System.out.println("Plate: " + food + " food");
    }
    //endregion
}
