package Lab_5;

public class Task_5 {

    private int number;

    //Методы для присваивания значения поля с аргументом и без
    public void setNumber(int number) {
        this.number = number;
        if (number>100){
            this.number =100;
        }
    }

    public void setNumber() {
        this.number = 0;
    }

    //Конструкторы класса Task_5 с аругментами и без
    public Task_5() {
        this.number = 0;
    }

    public Task_5(int number) {
        this.number = number;
        if (number >100){
            this.number = 100;
        }
    }

    //метод, возвращающий значение поля (позволяет проверить поле)
    public int getNumber() {
        return number;
    }

}
