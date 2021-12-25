package Laba_6;

public class Task_3 {
    private static int min = 0;
    private static int max = 0;
    private static double avg = 0;

    public static int min (int ... intArray){
        for (int x: intArray){
            if (x<min){
                min = x;
            }
        }
        return min;
    }

    public static void max (int ... intArray){
        for (int x: intArray){
            if (x>max){
                max = x;
            }
        }
        System.out.println (max);
    }

    public static void avg (int...intArray){
        for (int x:intArray){
            avg = (x+avg);
        }
        System.out.println(Math.round(avg/intArray.length));
    }

}
