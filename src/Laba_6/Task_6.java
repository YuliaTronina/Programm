package Laba_6;

public class Task_6 {
    private int [] intArray;
    private int x;

    public static void metArray (int [] intArray,int x){
        int size;
        if (intArray.length<x){
            size = intArray.length;
        }
        else{
            size = x;
        }
        int [] intArray2 = new int[size];

        for (int i = 0; i<size;i++){
            intArray2 [i] = intArray [i];
        }

        for (int i=0; i<intArray2.length;i++){
            System.out.print(intArray2[i]+" ");
        }
    }
}
