package Laba_8;

public class Rec2 {
    public static void k (int x){
        if ((2*x+1)<20) {
            k (2*x+1);
        }
        System.out.println("x = "+x);
    }

    public static void main(String[] args) {
        k(1);
    }
}
