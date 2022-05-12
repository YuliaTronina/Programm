package Laba_12.TreeSet;

import java.util.TreeSet;

public class SetDemo {
    private static long getRunningTimeCreateTreeSet (TreeSet<String>treeSet){
        // точка начала отсчета времени выполнения программы

        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция создания коллекции
        for (int i = 0; i < 9000000; i++) {

            treeSet.add("Example_" +i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddEntry (TreeSet<String>treeSet){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления

        treeSet.add("ExampleFirst");

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddLast(TreeSet<String>treeSet){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления

        treeSet.add(treeSet.last()+1);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddCentre(TreeSet<String>treeSet){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления

        treeSet.add("Example_" + (treeSet.size()/2 - 0.5));

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveFirst(TreeSet<String>treeSet){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления

        treeSet.pollFirst();

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveLast(TreeSet<String>treeSet){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления

        treeSet.pollLast();

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveCentre(TreeSet<String>treeSet){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления

        String count= "Example_"+ String.valueOf((treeSet.size()/2));
        treeSet.remove(count);


        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeFind(TreeSet<String>treeSet,String str){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления

        System.out.println(treeSet.contains(str) + str);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }


    public static void main(String[] args) {
        TreeSet <String> treeSet = new TreeSet<>();
        System.out.println(getRunningTimeCreateTreeSet(treeSet));

        System.out.println(getRunningTimeAddEntry(treeSet));

        System.out.println(getRunningTimeAddLast(treeSet));

        System.out.println(getRunningTimeAddCentre(treeSet));

        System.out.println(getRunningTimeRemoveFirst(treeSet));

        System.out.println(getRunningTimeRemoveLast(treeSet));

        System.out.println(getRunningTimeRemoveCentre(treeSet));

        System.out.println(getRunningTimeFind(treeSet,"Example_90000000"));

    }

}
