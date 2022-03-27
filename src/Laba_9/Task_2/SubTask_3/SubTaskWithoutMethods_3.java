package Laba_9.Task_2.SubTask_3;

// В программе, вычисляющей сумму элементов типа byte одномерного массива, вводимого с клавиатуры,
// могут возникать ошибки в следующих случаях:
//        – ввод строки вместо числа;
//        – ввод или вычисление значения за границами диапазона типа.
//без использования собственных методов генерирования исключений

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubTaskWithoutMethods_3 {
    public static byte sumByte (byte[] array){
        byte sum = 0;

        for (int i =0; i<array.length;i++){
            sum = (byte) (sum + array[i]);
        }

        return sum;
    }


    public static void main(String[] args) {
        int size = 5;
        byte[] arrayByte = new byte[size];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив из 5 элементов");

        try {
            for (int i = 0; i < size; i++) {
                arrayByte[i] = in.nextByte();
            }

            System.out.println(sumByte(arrayByte));
        }

        catch (InputMismatchException e){
            System.out.println("Введено недопустимое значение");
        }
    }
}
