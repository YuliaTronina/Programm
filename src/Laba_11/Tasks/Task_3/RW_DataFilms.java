package Laba_11.Tasks.Task_3;

//Используя рассмотренные в данной работе пример 9, выполнить задание согласно условию в виде проекта 2-й проект –
// работа через сериализацию. Условие:
//        Записать в исходный файл информацию о фильмах: название_фильма, год_выпуска, страна, жанр, стоимость_проката
//        Количество фильмов задать с клавиатуры. Создать программным способом другой файл и переписать в него
//        информацию о фильмах, выпущенных в России.

import java.io.*;
import java.util.Scanner;

class Film implements Serializable {
    String name;
    int year;
    String country;
    String type;
    double costs;

    public  Film (){  // Конструктор класса по умолчанию

    }

    // Конструктор класса
    public Film(String name, int year, String country, String type, double costs) {
        this.name = name;
        this.year = year;
        this.country = country;
        this.type = type;
        this.costs = costs;
    }
}

public class RW_DataFilms {
    public static void main(String[] args) throws ClassNotFoundException {
        String name=null;
        int year =0;
        String country=null;
        String type=null;
        double costs=0.0;

        try{
            File f1 = new File("MyFile4.txt");              //файл для записи данных
            f1.createNewFile();
            File f2 = new File("MyFile_Res4.txt");          //файл для записи данных, полученных из начального
            f2.createNewFile();

            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество фильмов, которое нужно записать =>");
            int filmCount = in.nextInt();
            in.nextLine();


            FileOutputStream fos = new FileOutputStream(f1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Film film;

            for(int i=0; i<filmCount;i++){
                System.out.println("Введите данные фильма: " + (i+1));
                System.out.println("Введите название =>");
                name=in.nextLine();
                System.out.println("Введите год выпуска =>");
                year = in.nextInt();
                in.nextLine();
                System.out.println("Введите страну производителя =>");
                country = in.nextLine();
                System.out.println("Введите жанр фильма =>");
                type = in.nextLine();
                System.out.println("Введите стоимость фильма =>");
                costs = in.nextDouble();
                in.nextLine();
                film = new Film(name, year, country,  type, costs);

                oos.writeObject(film);  // объект записывается в файл

            }

            oos.flush();
            oos.close();


            System.out.println();
            // создается поток для чтения объекта из файла
            FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(fis);

            //создаем поток для записи в новый файл
            FileOutputStream wr = new FileOutputStream(f2);
            ObjectOutputStream owr = new ObjectOutputStream(wr);

            for (int i=0;i<filmCount;i++){
                film = (Film) ois.readObject();
                if (film.country.toLowerCase().equals("россия") | film.country.toLowerCase().equals("russia")){
                    owr.writeObject(film);
                }
            }

            ois.close();
            owr.close();

       }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
