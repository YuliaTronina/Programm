package Laba_7;

class SubClass_Task4 extends SubSuperClass_Task4 {
    int num;

    SubClass_Task4(char letter, String str, int num){
        super(letter, str);
        this.num=num;
    }

    SubClass_Task4 (SubClass_Task4 ob) {
        super (ob);
        num = ob.num;
    }

    public void show () {
        System.out.println ("Символьное значение - " + letter + ", строка - " + str + ", число - " + num);
    }

}
