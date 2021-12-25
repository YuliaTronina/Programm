package Laba_6;

public class Task_7 {

    public static void charToInt (char [] chArray){
        int [] intArray = new int [chArray.length];

        //Переводим символьный массив в численный
        for (int i = 0; i<intArray.length;i++){
            intArray[i] = (int) chArray[i];
        }
        //Печатаем полученный массив
        for (int x:intArray){
            System.out.print(x + " ");
        }
    }
}
