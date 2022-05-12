package Laba_12.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo {
    // Метод для измерения времения создания ArrayList, заполненного строковыми данными
    private static long getRunningTimeCreateArrayList(ArrayList<String> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция создания коллекции
        for (int i = 0; i < 9000000; i++) {
            list.add("Example_"+i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    //Измерение времени добавления элемента в начало
    private static long getRunningTimeAddFirst(ArrayList<String> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция создания коллекции
            list.add(0,"FirstElement");

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    //Измерение времени добавления элемента в конец
    private static long getRunningTimeAddLast(ArrayList<String> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция создания коллекции
        list.add(list.size(), "LastElement");

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    //Измерение времени добавления элемента в середину
    private static long getRunningTimeAddCentre(ArrayList<String> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция создания коллекции
        list.add(list.size()/2, "CentreElement");

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    //Измерение времени удаления первого элемента
    private static long getRunningTimeDelFirst(ArrayList<String> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция создания коллекции
        list.remove(0);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    //Измерение времени удаления последнего элемента
    private static long getRunningTimeDelLast(ArrayList<String> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция создания коллекции
        list.remove(list.size()-1);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    //Измерение времени удаления элемента из середины
    private static long getRunningTimeDelCentre(ArrayList<String> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция создания коллекции
        list.remove(list.size()/2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    //Измерение времени получения элемента по индексу
    private static long getRunningTimeGet(ArrayList<String> list){


        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция создания коллекции
        Random rand = new Random();
        list.get(rand.nextInt(8000000));


        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Время создания динамического массива - ");
        System.out.println(getRunningTimeCreateArrayList(list));

        System.out.print("Время добавления первого элемента - ");
        System.out.println(getRunningTimeAddFirst(list));

        System.out.print("Время добавления элемента в середину - ");
        System.out.println(getRunningTimeAddCentre(list));

        System.out.print("Время добавления последнего элемента - ");
        System.out.println(getRunningTimeAddLast(list));

        System.out.print("Время удаления первого элемента - ");
        System.out.println(getRunningTimeDelFirst(list));

        System.out.print("Время удаления элемента из середины - ");
        System.out.println(getRunningTimeDelCentre(list));

        System.out.print("Время удаления последнего элемента - ");
        System.out.println(getRunningTimeDelLast(list));

        System.out.print("Время получения элемента по индексу - ");
        System.out.println(getRunningTimeGet(list));

    }

}
