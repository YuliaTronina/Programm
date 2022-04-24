package Laba_11.Examples;
//Пример 6. Работа с числовыми данными в файле с произвольным доступом. Выполнить следующие подзадачи:
    //– записать в файл заданное количество целых чисел
    //(1 число=4 байта);
    //– прочитать данные в прямом и обратном порядке;
    //– получить информацию о файле и указателе до ввода и после
    //ввода данных;
    //– отсортировать по возрастанию числа непосредственно в файле.

import java.io.*;
import java.util.Scanner;

public class RandAccNumb {
    public static void main(String[] args) {

       try {
           //Создание на диске папки Му
           File folder = new File("/home/julia/IdeaProjects/Programm//My1/");
           if (!folder.exists()) {
               folder.mkdir();
           }

           //создание файла в новой папке
           File f1  = new File("/home/julia/IdeaProjects/Programm//My1/MyFile3.txt");
           f1.createNewFile();

           Scanner sc = new Scanner(System.in, "cp1251");
           System.out.print("Сколько чисел нужно записать в файл? \n=>");

           int count = sc.nextInt();

           //открыть файл одновременно для чтения и записи (rw)
           RandomAccessFile rf = new RandomAccessFile(f1,"rw");
           System.out.println("Исходный размер файла в байтах = " + rf.length() + ", указатель стоит на "+
                   rf.getFilePointer()+"-м байте.");

           System.out.print("Веедите числа для записи в файл: ");

           //в цикле заводим числа
           for (int i = 0; i<count; i++){
               rf.writeInt(sc.nextInt());
           }

           System.out.println("Новый размер файла в байтах = "+ rf.length()+
                   ", указатель стоит на " + rf.getFilePointer() + "-м байте");

           System.out.println("Количество байтов на 1 число = " + rf.length()/count);
           rf.close();

           //открываем файл только для записи
           rf= new RandomAccessFile(f1,"r");

           //Читаем файл и выводим данные на экран
           System.out.println("\n Числа в файле: ");

           for (int i=0;i<count;i++){
               //Перевод указателч на текущее число 4*i байта, при последовательном считывании seek()можно было
               // не использовать
               rf.seek(4*i);
               System.out.println("Число " + i + rf.readLine());
           }

           System.out.println("Числа в обратном порядке");
           for (int i=count-1;i>=0;i--){
               rf.seek(4*i);
               System.out.println("Число "+ i + ": "+rf.readInt());
           }

           rf.seek(rf.getFilePointer()-4); //Перевод указателя на последнее число
           System.out.println("Количество чисел в файле = " + rf.length()/4+ ", последнее число - "+rf.readInt());

            //Поиск заданного числа в файле и определение его номера

           System.out.println("\n Введите число, которое нужно найти ");
           int x = sc.nextInt();
           int quant = 0;
           for(int i=0;i<count;i++){
               rf.seek(4*i);
               if(rf.readInt()==x){
                   quant++;
                   System.out.println("Число - " + x + ", номер в массива - " + i);
               }
           }

           System.out.println("Количество искомых чисел - " + quant);
           rf.close();

           //Сртировка чисел в файле методом "пузырька"
           rf = new RandomAccessFile(f1,"rw");
           for (int k = 0; k<count;k++){        //k - номер просмотра
               for (int i=0;i<count;i++) {      //i - номер числа
                   rf.seek(4 * i);
                   int number1 = rf.readInt();  //чтение i-го и i+1 чисел, запись их в переменные
                   int number2 = rf.readInt();

                   if(number1>number2) {                             //Условие сортировки по возрастанию
                   rf.seek(4*i);
                   rf.writeInt(number2);                            // запись чисел i и i+1 в обратном порядке
                   rf.writeInt(number1);
                   }
               }
           }

                   System.out.println("\nЧисла отсортированы в файле: ");
                   for (int i = 0; i<count;i++){
                       rf.seek(4*i);
                       System.out.println("Число "+i+": "+rf.readInt());
                   }
                   rf.close();
           }

       catch (IOException e){
           e.printStackTrace();
       }

       finally {

       }
       }
    }


