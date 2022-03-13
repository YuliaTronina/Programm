package Laba_8;

public class Fib {
    public static double fib (int x){
        if (x==0){
            return 0;
        }
        else if (x==1) {
            return 1;
        }
        else {
            return fib(x-1)+fib(x-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib (8));
    }
}
