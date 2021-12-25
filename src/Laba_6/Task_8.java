package Laba_6;

public class Task_8 {
    public static void avgArray (int...intArray){
        double avg = 0.0;
        int sum = 0;

        for (int x:intArray){
            sum = x+sum;
        }

        avg = (double) sum/intArray.length;
        System.out.println(avg);
    }
}
