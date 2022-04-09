package Laba_10.Example;

import java.io.*;
import java.util.Scanner;

public class FilesData {
    public static void main(String[] args) {

        try {
            File f1 = new File("/home/julia/IdeaProjects/Programm//My/intIsh.txt");
            f1.createNewFile();

            Scanner in = new Scanner(System.in, "cp1251");

            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = in.nextInt();

            System.out.println("Введите числа: ");
            for (int i = 0; i<count;i++){
                wr.writeFloat(in.nextFloat());
            }
            wr.flush();
            wr.close();


         //Создаем 2 файл
         File f2 = new File("/home/julia/IdeaProjects/Programm/My/intRez.txt");
         f2.createNewFile();
         DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
         DataOutputStream wr1 = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

        try{
            while (true){
                float number = rd.readFloat();
                wr1.writeFloat(number);
                System.out.println("Число " +(float) number);
            }
        }
        catch (EOFException e){}
            wr1.flush();
            wr1.close();
            rd.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " +e);
        }
      }
 }
