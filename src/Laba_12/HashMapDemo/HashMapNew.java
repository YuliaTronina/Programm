package Laba_12.HashMapDemo;

import java.util.HashMap;
import java.util.Random;

public class HashMapNew {


    //Измеряем время создания коллекции из n элементов
    private static long getRunningTimeCreateHashMap(HashMap <Integer,String> mapNew){
        // точка начала отсчета времени выполнения программы

        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция создания коллекции
        for (int i = 0; i<9*1000000;i++){
            mapNew.put( i ,"Example_" + i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    //Измеряем время получения элемента по ключу
    private static long getRunningTimeGetEl(HashMap <Integer,String> mapNew){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        Random rand = new Random();
        mapNew.get(rand.nextInt(9000000));

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> mapNew = new HashMap<>();
        System.out.println(getRunningTimeCreateHashMap(mapNew));
        System.out.println(getRunningTimeGetEl(mapNew));


//        //Получение коллекции
//        Set<Map.Entry<Integer,String>> set = mapNew.entrySet();
//
//        //вывод коллекции
//        for (Map.Entry<Integer,String> x:set){
//            System.out.println(x.hashCode() +", "+ x.getKey()+": "+x.getValue()+ " ");
//        }
//        System.out.println();



    }
}
