package Laba_9.Task_2.SubTask_1;

//        В программе, вычисляющей среднее значение среди положительных элементов одномерного массива
//        (тип элементов int), вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//        – ввод строки вместо числа;
//        – несоответствие числового типа данных;
//        – положительные элементы отсутствуют.

// Создание программы без использования методов, которые могут генерировать исключительную ситуацию

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubTaskWithoutMethods_1 {

    //Создаем метод, вычисляющий среднее положительных чисел 5-значного массива
    public static double averagePos(int[] array) throws ArithmeticException {
        int sum = 0;
        int quantity = 0;

        // Блок проверки на возникновение арифметической ошибки "деление на ноль", те не найдено ни одного положительного
        // элемента.

        try {

            for (int x : array) {
                if (x > 0) {
                    sum = sum + x;
                    quantity++;
                }
            }
            return (double) (sum / quantity);
        }

        // В случае введения только отрицательных значенией, возникает ошибка деления на 0, перехватываемая данным
        // блоком, выводится соответствующее сообщение.

        catch (ArithmeticException e) {
            System.out.println("Не введено ни одного положительного числа");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите одномерный массив из 5 элементов");
        int size = 5;
        int [] array = new int[size];

        // Блок проверки корректности введенных данных:соответствие типа введенных данных типу массива
        try {

            for (int i = 0; i < size; i++) {
                array[i] = in.nextInt();
            }

            System.out.println(averagePos(array));
        }

        catch (InputMismatchException e){
            System.out.println("Введен некорректный тип данных");
        }
    }
}
