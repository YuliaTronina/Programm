package Laba_6;

public class Task_9 {
    public static void charChange (char...chArray){
        char[]chArray2 = new char[chArray.length];
        for (int i=0;i<chArray.length;i++){
            chArray2 [i] = chArray[chArray.length-(i+1)];
        }

        for (int x:chArray2){
            System.out.print(x + " ");
        }
    }
}
