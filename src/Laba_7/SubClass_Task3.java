package Laba_7;

public class SubClass_Task3 extends SubSuperClass_Task3 {
    String str;

    public SubClass_Task3(int num, char letter, String str) {
        super(num, letter);
        this.str = str;
    }

    public void setNum(int num, char letter, String str) {
        super.num = num;
        super.letter = letter;
        this.str = str;
    }

    @Override
    public String toString (){
        return getClass().getSimpleName() + ": значение числового поля - " + num
                +", значение символьного поля - " + letter
                +", значение текстового поля - " + str;
    }

}
