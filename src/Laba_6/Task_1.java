package Laba_6;

public class Task_1 {
    private String st = null;
    private char [] chArray;
    private char ch = 0;

    public void inpLetter (char ch) {
        this.ch = ch;
        System.out.println(this.ch);
    }

    public void inpLetter (String st) {
        this.st = st;
        System.out.println(this.st);
    }

    public void inpLetter (char...chArray) {
        if (chArray.length == 1) {
           this.ch = chArray[0];
            System.out.println(ch);
        }
        else {
            this.st = String.copyValueOf(chArray);
            System.out.println(st);
        }
    }
}

