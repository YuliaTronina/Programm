package Laba_7;

class SubSuperClass_Task4 extends SuperClass_Task4 {
    String str;

    SubSuperClass_Task4 (char letter, String str){
        super (letter);
        this.str = str;
    }

    SubSuperClass_Task4 (SubSuperClass_Task4 ob){
        super(ob);
        str = ob.str;
    }

    public void show () {
        System.out.println ("Символьное значение - " + letter + ", строка - " + str);
    }

}
