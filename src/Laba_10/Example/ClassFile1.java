package Laba_10.Example;

import java.io.File;

public class ClassFile1 {
    public static void main(String[] args) {
        try{

            //Создание файла в текущей папке (где расположен основной класс
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()){
                System.out.println("Создан!!!");
                System.out.println("Полный путь 1 - " + f1.getAbsolutePath());
            }

            //Создание файла в конкретной папке
            File f2 = new File("/home/julia/Документы/Учеба_Юля/Программирование/Лабораторная_работа_10//MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2 - " + f2.getAbsolutePath());

            //Создание нескольких вложенных папок
            File f3 = new File("/home/julia/Документы/Учеба_Юля/Программирование/Лабораторная_работа_10//Папка_1//Папка_2");
            f3.mkdirs();
            System.out.println("Полный путь 3 - " + f3.getAbsolutePath());

        }
        catch (Exception e){
            System.out.println("Ошибка!!! " + e);
        }
    }
}
