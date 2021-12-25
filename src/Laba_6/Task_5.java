package Laba_6;

public class Task_5 {
    public static long sumSq (int x) {
        long res = 0;
        for (int i = 0; x-i>0;i++){
            res = res + (long) Math.pow (x-i, 2);
        }
        return res;
    }

    public static long sumSqRec (int x){
        long res;


        if (x==1){
            return 1;
        }
        res = sumSqRec(x-1) + x*x;
          return res;
    }
}
