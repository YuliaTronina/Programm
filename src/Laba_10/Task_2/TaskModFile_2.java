package Laba_10.Task_2;

import java.io.*;

public class TaskModFile_2 {
//Программа для записи данных из исходного файла, соответствующего определенному условию.
    public static void main(String[] args) {
        int countLine = 0;
        DataInputStream dataIn = null;
        DataOutputStream dataOut = null;
        String str;
        double db;
        int dbCount=0;


        // Открываем поток чтения и записи
        try {
            dataIn = new DataInputStream(new FileInputStream("My/FileTask_2.txt"));
            File f2 = new File("My/FileTaskRes_2.txt");
            f2.createNewFile();
            dataOut = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

        //Выбираем данные, соответствующие условию: 2 строка и положительные числа
            while (true) {
                countLine++;
                if (countLine <= 2) {
                    str = dataIn.readUTF();
                    if (countLine == 2) {
                        dataOut.writeUTF(str);
                    }

                }
                if (countLine == 3) {
                    for (int i = 0; i < 5; i++) {
                        db = dataIn.readDouble();
                        if(db>0){
                            dbCount++;
                            dataOut.writeDouble(db);
                        }
                   }
                    break;
                }
            }

        //Закрываем потоки
            dataIn.close();
            dataOut.flush();
            dataOut.close();
            }

       // Перехватываем ошибки
       catch (IOException e){
            System.out.println();
            e.printStackTrace();
       }

        DataInputStream dataNew=null;
        int count = 0;

        try {
            dataNew = new DataInputStream(new FileInputStream("My/FileTaskRes_2.txt"));

            while (true) {
                count++;
                if (true) {
                    System.out.println(dataNew.readUTF());
                    for (int i=0; i<dbCount;i++){
                        System.out.print(dataNew.readDouble()+" ");
                    }
                    break;
                }
            }
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }
}
