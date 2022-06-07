package Laba_11.Examples;

 // Пример 9. Ввести с клавиатуры информацию о стране вида: название, площадь. Записать ее в файл, а затем прочитать.

import java.io.Serializable;
import java.io.*;
import java.util.Scanner;

class Country implements Serializable {
    String name;
    double square;
}

public class Seril_Example{
    public static void main(String[] args) throws ClassNotFoundException {

           try {
            // Создание файла на фиске
            File f1 = new File ("/home/julia/IdeaProjects/Programm//My2/MyFile6.txt");
            f1.createNewFile();

            //Поток для ввода данных
            Scanner in = new Scanner(System.in);


            //Запись объектов в файл
            FileOutputStream fos = new FileOutputStream(f1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //Вводится информация о стране
            Country country = new Country();
            System.out.println("Введите информацию о стране:");
            System.out.println("Введите название страны =>");
            country.name = in.nextLine();
            System.out.println("Введите площадь страны, кв км =>");
            country.square = in.nextDouble();

            //Объект страна, состоящий из названия и площади записывается в файл
            oos.writeObject(country);

            //Дописывается информация, закрывается поток
            oos.flush();
            oos.close();


            //Чтение объекта из файла
              //Создается поток для чтения из файла
            FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(fis);

            //Объект считывается, на экран выводится требуемая информация
            country = (Country) ois.readObject();
            System.out.println("Название страны " + country.name + ", ее площадь - " + country.square +" кв. км");

            //Поток закрывается
            oos.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }


}
