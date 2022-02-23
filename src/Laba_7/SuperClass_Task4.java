package Laba_7;

class SuperClass_Task4 {
    char letter;

    SuperClass_Task4(char letter) {
        this.letter = letter;
    }

    SuperClass_Task4(SuperClass_Task4 ob) {
       letter = ob.letter;
    }

    public void show () {
        System.out.println("Символьное значение - " + letter);
    }

}
