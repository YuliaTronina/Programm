package Laba_11.Examples;
//Пример 5. Выполнить чтение из одного файла и запись в другой файл с использованием класса PrintWriter.

import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
           //Создание символьных потоков чтения и записи
            br = new BufferedReader(new InputStreamReader(new FileInputStream("MyFile1.txt"),"cp1251"));
            pw = new PrintWriter("MyFile2.txt", "cp1251");


            //Чтение данных из одного файла и запись их в другой файл
            int lineCount=0;
            String s;

            while ((s=br.readLine())!=null) {
                lineCount++;
                pw.println("пример 5, " + lineCount + ": " + s);
            }
         }

        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            br.close();
            pw.flush();
            pw.close();
        }
    }
}
