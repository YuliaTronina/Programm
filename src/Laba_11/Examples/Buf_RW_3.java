package Laba_11.Examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.*;

// Пример 2.Чтение из одного файла и запись в другой файл данных построчно с использованием буфера в 1 килобайт.


public class Buf_RW_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter wr = null;

        try{
            br = new BufferedReader(new FileReader("MyFile1.txt"),1024); //поток для чтения
            wr = new BufferedWriter(new FileWriter("MyFile2.txt"));          // поток для записи

            int lineCount = 0;   //счетчик строк
            String str;
            String s;

            //Чтение и запись из одного файла в другой
            while ((str=br.readLine())!=null){
                lineCount++;
                s = lineCount + ": " + str;
                System.out.println(s);
                wr.write(s);
                wr.newLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        finally {
            br.close();
            wr.flush();
            wr.close();
        }
    }
}
