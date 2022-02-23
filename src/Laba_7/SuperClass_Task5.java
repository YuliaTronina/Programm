package Laba_7;

public class SuperClass_Task5 {
    protected String str;

    public SuperClass_Task5(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString () {
        return getClass().getName() + ": строка - " + str;
    }

}
