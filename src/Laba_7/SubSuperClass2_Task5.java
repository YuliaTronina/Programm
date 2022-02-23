package Laba_7;

public class SubSuperClass2_Task5 extends SuperClass_Task5 {
    protected char letter;

    public SubSuperClass2_Task5(String str, char letter) {
        super(str);
        this.letter = letter;
    }

    @Override
    public String toString () {
        return getClass().getName() + ": строка - " + str + ", символьное значение - " + letter;
    }
}
