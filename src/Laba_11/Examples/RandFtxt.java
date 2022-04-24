package Laba_11.Examples;

//Пример 7. Выполнить запись строк и чтение их из файла с произвольным доступом.

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandFtxt {
    public static void main(String[] args) {
        try {
            File folder = new File("/home/julia/IdeaProjects/Programm//My2/");
            if(!folder.exists()){
                folder.mkdir();
            }


            File f1 = new File("/home/julia/IdeaProjects/Programm//My2/MyFile4.txt");
            f1.createNewFile();

            Scanner sc = new Scanner(System.in);
            System.out.println("Сколько строк нужно записать в файл? \n =>");
            int count = sc.nextInt();
            sc.nextLine();

            RandomAccessFile rf = new RandomAccessFile(f1,"rw");     //чтение/запись
            rf.setLength(0);
            long len = rf.length();
            System.out.println("Открыть файл размером " + len + " байт");
            System.out.println("Введите строки: ");
            int quantity = 0;

            //записать строки в файл
            for(int i = 0;i<count;i++){
                String str = sc.nextLine();
                rf.writeUTF(str);
                quantity+= str.length();
            }

            len = rf.length();
            System.out.println("Размер файла в байтах = "+ len);
            rf.close();

            //Открыть файл для чтения "r"
            RandomAccessFile rr = new RandomAccessFile(f1,"r");

            //Вывод строк из файла на экран
            System.out.println("Строки из файла: ");
            rr.seek(0);  // Перевести указатель в начало файла (на первое слово)
            for(int i = 0; i<count; i++){
               System.out.println("Строка " + i + " начинается с байта " + rr.getFilePointer() + " - " +rr.readUTF() +
                       ", заканчивается байтом " + (rr.getFilePointer()-1));
            }
            rr.close();
        }
        catch (IOException e){
            System.out.println("End of file " + e);
        }
    }

}
