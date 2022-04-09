package Laba_10.Task_2;

// Создать проект, позволяющий из одного, предварительно созданного программными средствами файла, переписать данные,
// соответствующие условию - в исходном файле содержится две строки в формате UTF-8 и 5 чисел типа double.
// В результирующий файл переписать вторую строку и положительные числа.

import java.io.*;
import java.util.Scanner;

public class TaskCreateFile_2 {
    public static void main(String[] args) throws IOException {

        //Создание и заполнение исходного файла
        File f1 = new File("My/FileTask_2.txt");
        Scanner in = new Scanner(System.in);
        double db;


        try {
            f1.createNewFile();

            System.out.println("Введите 2 стороки для записи в файл");
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));

            for (int i = 0; i < 2; i++) {
                String str = in.nextLine();
                dOut.writeUTF(str + "\n");
            }

            System.out.println("Введите 5 чисел типа double:");
            for (int i = 0; i < 5; i++) {
                db = in.nextDouble();
                dOut.writeDouble(db);
            }

            in.close();
            dOut.flush();
            dOut.close();

        }

        catch (IOException e) {
            System.out.println(e);;
        }


    }
}

