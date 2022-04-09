package Laba_10.Task_3;

// Создать проект, позволяющий из одного текстового файла, содержащего несколько строк (тип String) заранее
// подготовленного текста на русском языке (Пушкин, Лермонтов или другой российсмки классик на Ваш вкус),
// построчно переписать в другой текстовый файл слова начинающиеся с согласных букв.

//Взят кусок текста из учебника по джава

import java.io.*;
import java.util.ArrayList;


public class Main {
    //Создаем главный метод, который будет запускать программу, в котором вероятно возникновение ошибок ввода-вывода
    public static void main(String[] args) throws IOException {

    // Создаем необходимые переменные:
    //        int lineCount - счетчик строк, необходим для вывода номера строки
    //        String s - считываемая строка
    //        String str = null - итоговая строка
    //        BufferedReader br = null; - поток ввода
    //        BufferedWriter out = null; - поток вывода (записи)
    //        int wordsCount - размер ArrayList со словами, удовлетворяющими условию на согласность

    int lineCount = 0;
    String s;
    String str = null;
    BufferedReader br = null;
    BufferedWriter out = null;
    int wordsCount = 0;


    // В блоке try{} открываем символьные потоки ввода и вывода, создаем результирующий файл, в который будет записан результат
    // преобразования строк. В цикле while() с условием дохождения до конца документа (пустая строка), производим
    // необходимые преобразования.

    try {
        br = new BufferedReader(new FileReader("My/Text.txt")); // Связываем поток ввода с исходным файлом
        File f1 = new File("My/TextRes.txt");
        f1.createNewFile();                                              //Создаем результирующий файл
        out = new BufferedWriter (new FileWriter(f1.getAbsolutePath())); //Связываем созданный файл с потоком вывода / записи

        while ((s=br.readLine())!=null){                                 //Построчно читаем переданный файл, если строка непустая, выполняем действия в цикле
            lineCount++;                                                 //Подсчитываем номер строки
            ArrayList<String> list = Methods.findSoglWord(s, " ");  //Преобразуем считанную строку в нужный нам ArrayList
            if((wordsCount = list.size())!=0){                           //Проверяем, что в строке есть слова с согласной букывы
               str = lineCount + ": кол-во слов - " + wordsCount + ": " + Methods.toString(list); // Создаем строку для записи
            }
            out.write(str);                                                //Записываем новую строку
            out.newLine();                                                 //Переходим на следующую строку
        }

    }
    catch (EOFException e){                                             //Перехват ошибок из блока try{}
        e.printStackTrace();
    }
    catch (IOException e){
        e.printStackTrace();
    }

    br.close();
    out.flush();
    out.close();
        System.out.println("Преобразование выполнено");             //Информация, что преобразование выполнено
    }
    }

