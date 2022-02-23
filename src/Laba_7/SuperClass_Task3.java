package Laba_7;

public class SuperClass_Task3 {
    int num;

    public SuperClass_Task3(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString (){
          return getClass().getSimpleName() + ": значение числового поля - " + num;
    }
}
