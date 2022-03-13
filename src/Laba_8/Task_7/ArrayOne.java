package Laba_8.Task_7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOne {
    public static void main(String[] args) {
        //Ввести с клавиатуры список из n целых чисел

        Scanner in = new Scanner(System.in);
        ArrayList < Integer > listData = new ArrayList < Integer > ();

        while (in.hasNextInt()) {
            int i = in.nextInt();
            listData.add(i);
        }

        for (int x:listData) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("Сумма элементов, делящтхся на 3 - " + Methods.Sum_3(listData));
        System.out.println("Количество элементов, делящтхся на 3 - " + Methods.Quantity_3(listData));
        System.out.println("Среднее элементов, делящтхся на 3 - " + Methods.Average_3(listData));
        System.out.println();

        Methods.Replace(listData);



    }
}
