package Laba_10.Example;

import java.io.*;

public class Buf_RW_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter wr = null;

        try{
            br = new BufferedReader(new FileReader("MyFile1.txt"), 1024);
            wr = new BufferedWriter(new FileWriter("File_2.txt"));

            int lineCount = 0;
            String s;

            //Переписывание информации из одного файла в другой
            while ((s = br.readLine())!=null){
                lineCount++;
                System.out.println(lineCount +" " + s);
                wr.write(s);
                wr.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Ошибка: " + e);
        }
        finally {
            br.close();
            wr.flush();
            wr.close();
        }
    }
}
