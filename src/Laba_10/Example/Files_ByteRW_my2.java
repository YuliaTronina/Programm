package Laba_10.Example;

import java.io.*;
import java.util.Scanner;

public class Files_ByteRW_my2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String frame = in.nextLine();

        try {
            File f1 = new File(frame);
            f1.createNewFile();
            System.out.println("Полный путь до файла - " + f1.getAbsolutePath());

            System.out.println("Введите количество строк для записи в файл: ");
            int n = in.nextInt();

            //Создается поток для записи с учетом типа данных - DataOutputStream,
            // ему в качестве параметра передается поток FileOutputStream

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            in.nextLine();

            for (int i=0; i<n;i++){
                System.out.println("Введите строку для записи:");
                String s = in.nextLine();
                dOut.writeUTF(s);
            }
            dOut.flush();
            dOut.close();

            //Чтение и вывод данных из созданного файла
            DataInputStream dInp = new DataInputStream(new FileInputStream(f1));
            while (true){
                System.out.println(dInp.readUTF());
            }
        }
        catch (Exception e){
            System.out.println(" " + e);
        }
    }
}
