package Laba_9.Task_2.SubTask_3;

// В программе, вычисляющей сумму элементов типа byte одномерного массива, вводимого с клавиатуры,
// могут возникать ошибки в следующих случаях:
//        – ввод строки вместо числа;
//        – ввод или вычисление значения за границами диапазона типа.
// с использованием собственных методов генерирования исключений

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubTaskWithMethods_3 {
    // сгенерируем свой класс ошибок, наследующий от класса InputMismatchException
    static class OutputMismatchException extends InputMismatchException {

    }

    public static byte sumByte (byte [] array){
    //введем блок try{}
    int sum = 0;
    byte sumByte =0;

    try {
        for(int x:array) {

                   sum = sum + x;
          }

        //проверяем результат суммирования на соответствие типу byte
        if(sum>127|sum<-128){
                throw new OutputMismatchException();
        }

     return (byte) sum;
    }
    catch (OutputMismatchException e){
        System.out.println("Значение суммы выходит за границы диапазона byte");
        return 0;
    }
    catch (InputMismatchException e){
        System.out.println("Введенные значения не byte");
        return 0;
    }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size=5;
        byte[]array = new byte[size];
        System.out.println("Введите 5-значеный массив типа byte");

        try {
            for (int i = 0; i < size; i++) {
                array[i] = in.nextByte();
                if (array[i]>127|array[i]<-128){
                    throw new OutputMismatchException();
                }
            }
            System.out.println(sumByte(array));
        }


        catch (OutputMismatchException e){
            System.out.println("Значение введенного числа выходит за границы диапазона byte");

        }
        catch (InputMismatchException e){
            System.out.println("Введенные значения не byte");

        }

    }
}
