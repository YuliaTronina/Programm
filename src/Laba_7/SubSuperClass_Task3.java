package Laba_7;

public class SubSuperClass_Task3 extends SuperClass_Task3 {
    char letter;

    public SubSuperClass_Task3(int num, char letter) {
        super(num);
        this.letter = letter;
    }

    public void setNum(int num, char letter) {
        super.num = num;
        this.letter = letter;
    }

    @Override
    public String toString (){
        return getClass().getSimpleName() + ":" + " значение числового поля - " + num
                + ", "+" значение символьного поля - " + letter;
    }

}
