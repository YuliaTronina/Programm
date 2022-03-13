package Laba_8.Task_7;

import java.util.ArrayList;

public class Methods {
    static int sum =0;
    static int quantity = 0;
    static double average = 0;

    public static int Sum_3 (ArrayList<Integer> array) {
        for (int x:array){
            if (x%3==0){
                sum = sum + x;
            }
        }
        return sum;
    }

    public static int Quantity_3 (ArrayList<Integer> array) {
        for (int x:array){
            if (x%3==0){
                quantity++;
            }
        }
        return quantity;
    }

    public static double Average_3 (ArrayList<Integer> array) {
        return (double) Sum_3(array)/Quantity_3(array);
    }

    public static void Replace (ArrayList <Integer> array) {
        int min = 0;
        int minIndex = 0;

        for (int i = 0; i<array.size();i++){
            if (array.get(i)%3==0){
                min = array.get(i);
                minIndex = i;
            }
        }

        for (int i = 0; i < array.size(); i++) {
            if ((array.get(i) % 3 == 0) && (array.get(i) < min)) {
                min = array.get(i);
                minIndex = i;
            }
        }

        int max = array.get(1);
        int maxIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            if ((array.get(i) % 3 == 0) && (array.get(i) > max)) {
                max = array.get(i);
                maxIndex = i;
            }
        }
        System.out.println("Старый список: ");
        for (int x:array){
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("Min - " + min + ", minIndex - " + minIndex);
        System.out.println("Max - " + max + ", maxIndex - " + maxIndex);


        array.remove(minIndex);
        array.add(minIndex, max);
        array.remove(maxIndex);
        array.add(maxIndex,min);

        System.out.println("Список после перестановки +:");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
