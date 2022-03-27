package Laba_9.Task_2.SubTask_2;

//        В программе, где требуется из матрицы вывести столбец с номером, заданным с
//        клавиатуры, могут возникать ошибки в следующих случаях:
//        – ввод строки вместо числа;
//        – нет столбца с таким номером.

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubTaskWithoutMethods_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер удаляемого столбца: ");
        try {
            int k = in.nextInt();
            int [] [] array = {{1,2,3,4,5,6},
                    {7,8,9,10,11,12},
                    {13,14,15,16,17,18},
                    {19,20,21,22,23,24},
                    {25,26,27,28,29,30}};

            System.out.println("Удаляемый столбец");

            for (int i=0;i<array.length;i++){
                System.out.println(array[i][k]);
            }

            System.out.println("Оставшийся массив");
            for (int i = 0;i<array.length;i++){
                for (int j = 0; j<array[i].length; j++) {
                    if (j!=k) {
                        System.out.print(array[i][j] + " ");
                    }
                }

                System.out.println();
            }
        }

        catch (InputMismatchException e){
            System.out.println("Введено недопустимое значение номера столбца");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Номер столбца выходит за пределы массива");
        }
    }
}
