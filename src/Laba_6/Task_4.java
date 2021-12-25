package Laba_6;

public class Task_4 {
    public static long factRec (int x){
        long res;

        if (x == 1) {
            return 1;
       }
       if (x == 2 ){
              return 2;
           }

        res = factRec (x-2)*x;
        return res;
    }

    public static long fact (int x) {
        long res = 1;
        for (int i = 0;x-2*i>0;i++) {
            res = res*(x-2*i);
        }
        return res;
    }
}
