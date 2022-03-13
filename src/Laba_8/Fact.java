package Laba_8;

public class Fact {
    public static int fact (int x) {
        if (x==1){
            return 1;
        }
        else{
            return fact (x-1)*x;
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

}
