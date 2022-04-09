package Laba_10.Example;

import java.io.*;

public class Buf_WR_IO_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // Создание потоков для чтения и записи в нужной кодировке
            br = new BufferedReader(new InputStreamReader(new FileInputStream("MyFile1.txt"),"cp1251"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("File_2.txt"),"cp1251"));

            //Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;

            while ((s=br.readLine())!=null) {
                lineCount++;
                System.out.println(lineCount + ":" + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Ошибка: " + e);
        }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
