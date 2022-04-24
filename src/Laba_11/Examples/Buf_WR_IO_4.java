package Laba_11.Examples;

// Пример 4. Чтение из одного файла и запись в другой файл данных построчно с использованием буферизации символьных
// потоков, основанных на байтовых файловых потоках.

import java.io.*;

public class Buf_WR_IO_4 {
        public static void main(String[] args) throws IOException {
              BufferedReader br = null;
              BufferedWriter bw = null;

              try {
                   //создание потоков для чтения и записи
                   br = new BufferedReader(new InputStreamReader(new FileInputStream("MyFile1.txt"),"cp1251"));
                   bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("MyFile2.txt"),"cp1251"));

                   //Читаем один файл и записываем из него данные во второй
                   String str;
                   String s;
                   int lineCount=0;

                   while ((str = br.readLine())!=null){
                           lineCount++;
                           s = lineCount + " пример 4, : " + str;
                           bw.write(s);
                           bw.newLine();
                   }
              }
              catch (IOException e){
                      e.printStackTrace();
              }

              finally {
                      br.close();
                      bw.flush();
                      bw.close();
              }
        }
}
