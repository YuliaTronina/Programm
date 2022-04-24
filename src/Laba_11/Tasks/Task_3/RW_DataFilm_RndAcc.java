package Laba_11.Tasks.Task_3;

//Используя рассмотренные в данной работе пример 8, выполнить задание согласно условию в виде проекта 1-й проект –
// работа с файлом с произвольным доступом. Условие:
//        Записать в исходный файл информацию о фильмах: название_фильма, год_выпуска, страна, жанр, стоимость_проката
//        Количество фильмов задать с клавиатуры.
//        Создать программным способом другой файл и переписать в него информацию о фильмах, выпущенных в России.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RW_DataFilm_RndAcc {
    public static void main(String[] args) throws IOException,FileNotFoundException{

        try{
            //Создаем файл для первоначальной записи фильмов
            File f1 = new File("MyFile5.txt");
            f1.createNewFile();
            RandomAccessFile rnd = new RandomAccessFile(f1, "rw");

            //Создаем файл для записи отфильтрованного списка
            File f2 =new File("MyFileRes_5.txt");
            f2.createNewFile();

            //Создаем переменные для записи данных по фильмам
            String name = null;
            int year =0;
            String country  = null;
            String type = null;
            double costs = 0;

            // Создаем объект класса Scanner для ввода данных с клавиатуры
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество фильмов для записи=>");
            int countFilm = in.nextInt();
            in.nextLine();
            long [][] arrayData = new long[countFilm][2]; //массив для записи начала и конца записи о каждом фильме

            //Вводим данные по фильмам и записываем их в файл при этом для названия добиваем объем символов до
            // 20, страна и остальные строковые переменные до 10, чтобы данные было проще искать.

            System.out.println("Введите данные по фильмам");
            for (int i = 0;i<countFilm;i++){
                System.out.println("Введите данные для фильма " + (i+1));
                System.out.println("Введите название фильма=> ");
                long startData = rnd.getFilePointer();

                name=in.nextLine();
                rnd.writeUTF(name);
                for(int j=0; j<20- name.length();j++){
                        rnd.writeByte(1
                        );
                    }

                System.out.println("Введите год выпуска=> ");
                year = in.nextInt();
                in.nextLine();
                rnd.writeInt(year);

                System.out.println("Введите страну-производителя =>");
                country = in.nextLine();
                rnd.writeUTF(country);
                for (int j=0;j<10-country.length();j++){
                    rnd.writeByte(1);
                }

                System.out.println("Введите жанр фильма=> ");
                type=in.nextLine();
                rnd.writeUTF(type);
                for(int j=0;j<10-type.length();j++){
                    rnd.writeByte(1);
                }

                System.out.println("Введите затраты на производство фильма =>");
                costs = (int) in.nextDouble();
                in.nextLine();
                rnd.writeDouble(costs);
                long finishData = rnd.getFilePointer();


                    for (int j=0;j<2;j++){      //записываем координаты начала и конца записи
                        arrayData [i][0] = startData;
                        arrayData [i][1] = finishData;

                    }
            }
            rnd.close();

            RandomAccessFile rn = new RandomAccessFile(f1,"r");
            RandomAccessFile wrnd = new RandomAccessFile(f2,"rw");

            String str=null;
            rn.seek(0);
            long point = 0;
            for (int i=0; i<countFilm;i++){
                name = rn.readUTF();
                for (int j=0;j<20-name.length();j++){
                    rn.readByte();
                }

                year = rn.readInt();

                country=rn.readUTF();
                for (int j=0;j<10-country.length();j++){
                    rn.readByte();
                }

                type = rn.readUTF();
                for (int j=0; j<10-type.length();j++){
                    rn.readByte();
                }

                costs = rn.readDouble();

                if(country.toLowerCase().equals("россия")|country.toLowerCase().equals("russia")){
                    wrnd.writeUTF(name);
                    wrnd.writeInt(year);
                    wrnd.writeUTF(country);
                    wrnd.writeUTF(type);
                    wrnd.writeDouble(costs);
                }
           }


            rn.close();
            wrnd.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }



}
