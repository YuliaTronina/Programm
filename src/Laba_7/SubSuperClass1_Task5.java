package Laba_7;

public class SubSuperClass1_Task5 extends SuperClass_Task5 {
      protected int num;

    public SubSuperClass1_Task5(String str, int num) {
        super(str);
        this.num = num;
    }

    @Override
    public String toString () {
        return getClass().getName() + ": строка - " + str + ", числовое значение - " + num;
    }
}
