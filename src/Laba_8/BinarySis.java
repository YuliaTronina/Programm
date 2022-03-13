package Laba_8;

public class BinarySis {
    public static void binarySis (int x) {
        int k = x%2;

        if(x/2<1){
         k = 1;
        }
          else {
            binarySis(x/2);
          }

        System.out.print(k +" ");
    }


    public static void main(String[] args) {
        binarySis(25);
    }
}
