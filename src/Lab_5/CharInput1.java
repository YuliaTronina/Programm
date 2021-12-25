package Lab_5;

public class CharInput1 {
    private char ch1;
    private char ch2;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    public void setCh2(char ch2) {
        this.ch2 = ch2;
    }

    public void charRange (){
        char min = ch1;
        char max = ch2;
        if (ch1>ch2){
               min = ch2;
               max = ch1;
           }

        for (char i = min; i<=max;i++){
            System.out.print (i + " ");
        }

    }


}
