package Laba_11.Examples;

//Пример 8. Записать в файл с произвольным доступом данные о заданном количестве сотрудников и считать информацию
// из файла. Данные о сотрудниках:
    //– фамилия, должность – записывается в формате строки UTF-8;
    //– оклад – число типа int.
//Один символ в формате UTF – 1 байт, число типа int – 4 байта. Разное количество байтов для фамилии и должности
// дополним с помощью «дозаписи» любых чисел типа byte до общего размера, например, 20. Значение выбрано из расчета
// того, что фамилия и должность будут иметь длину не более 20 символов.

import java.io.*;
import java.util.Scanner;

public class RandAccF_Record {
    public static void main(String[] args) {

        try {
            //создаем файл
            File f1 = new File("/home/julia/IdeaProjects/Programm//My2/MyFile5.txt");
            f1.createNewFile();

            //подготавливаем данные для записи в файл, открываем поток для чтения/записи
            RandomAccessFile rw = new RandomAccessFile(f1,"rw");
            long fSize = f1.length();

            Scanner in = new Scanner(System.in, "cp1251");
            //Заводим количество сотрудников
            System.out.println("Введите количество сотрудников для записи в файл \n " + "=>");
            int quantity = in.nextInt();
            in.nextLine();

            String surname, position;   //Переменные для ФИО и должности
            int salary;   //Переменная для оклада

            //Запись информации о сотрудниках в файл
            for (int i = 0; i < quantity; i++) {
                rw.seek(0);
                System.out.println("Введите фамилию " + (i+1) + " сотрудника");
                surname = in.nextLine();
                rw.seek(rw.length()); //поиск конца файла
                rw.writeUTF(surname); //запись фамилии в файл
                    for (int j=0; j<20-surname.length();j++){
                        rw.writeByte(1);
                    }

                System.out.println("Введите должность " + (i+1) + " сотрудника");
                position = in.nextLine();
                rw.writeUTF(position);
                for (int j=0; j<20-position.length();j++){
                    rw.writeByte(1);
                }

                System.out.println("Введите оклад сотрудника");
                salary = in.nextInt();
                in.nextLine();          //очистка буфера
                rw.writeInt(salary);
            }
            rw.close();


            //Чтение данных из файла
            RandomAccessFile rr = new RandomAccessFile(f1,"r");
            rr.seek(0);  //перемещение в начало файла

            System.out.println("Данные сотрудников:");
            System.out.println("Фамилия \t\t\t Должность \t\t\t Оклад");
            for (int i = 0; i<quantity;i++){
                surname = rr.readUTF();   // читаем фамилию
                for (int j=0; j<20-surname.length();j++){
                    rr.readByte();
                }

                position = rr.readUTF();  // читаем должность
                for (int j=0;j<20-position.length();j++){
                    rr.readByte();
                }
                salary = rr.readInt();    // читаем заработную плату

                System.out.println(surname + "\t\t\t" + position + "\t\t\t" + salary);
            }
            rr.close();
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }

}
