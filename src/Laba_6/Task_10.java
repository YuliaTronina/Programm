package Laba_6;

public class Task_10 {
    public static void res (int...intArray) {
        int max = 0;
        int min = 0;


        for (int x:intArray){
            if (x<min){
                min = x;
            }
            if (x>max){
                max = x;
            }
        }

        int [] res = {max,min};

        for (int x:res){
            System.out.print(x+" ");
        }
    }
}
