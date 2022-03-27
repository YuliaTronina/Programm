package Laba_9.Task_2.SubTask_1;

//        В программе, вычисляющей среднее значение среди положительных элементов одномерного массива
//        (тип элементов int), вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//        – ввод строки вместо числа;
//        – несоответствие числового типа данных;
//        – положительные элементы отсутствуют.

// Создание программы c использованием методов, которые могут генерировать исключительную ситуацию

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubTaskWithMethods_1 {
    // Создадим новые класс исключений, наследующий от типа арифметических ошибок и ошибок ввода
    static class ResultNotIntException extends ArithmeticException{

    }

    static class InputNullException extends InputMismatchException{

    }

    //Создаем метод, вычисляющий среднее положительных чисел
    public static int averagePos (int [] array) {
    int sum = 0;
    int quantity = 0;

    // Блок проверки кода на возникновение арифметических ошибок:деление на 0 и потери части данных

    try {
        for (int x:array){
            if(x>0){
                sum = sum + x;
                quantity++;
            }
        }

        if (sum%quantity!=0){
            throw new ResultNotIntException();
        }

        return (sum/quantity);
    }
        catch (ResultNotIntException e){
            System.out.println("Среднее положительного массива данных нецелое");
            return 0;
        }

        catch (ArithmeticException e){
            System.out.println("В массиве отсутствуют положительные значения");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 5;
        int[] array = new int[size];
        System.out.println("Введите 5-значный массив:");

        try {

            for (int i = 0; i < size; i++) {
                array[i] = in.nextInt();
            }

            for (int x:array){
                if(x==0){
                    throw new InputNullException();
                }
            }

            System.out.println(averagePos(array));

        }

        catch (InputNullException e){
            System.out.println("Введен 0, введите ненулевые значения");
        }

        catch (InputMismatchException e){
            System.out.println("Введено нецелое значение");
        }
    }
}
