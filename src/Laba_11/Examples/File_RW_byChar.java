package Laba_11.Examples;

import java.io.*;

public class File_RW_byChar {
    //Пример 1. Чтение из одного файла и запись в другой файл данных посимвольно.

    public static void main(String[] args) throws IOException {
        Reader in= null;
        Writer out = null;

        try{
            in = new FileReader("MyFile1.txt"); //файл для чтения
            out = new FileWriter("MyFile2.txt", true); //файл для записи

            //Данные считываются и записываются побайтно, как и для InputStream/OutputStream

            int oneByte;
            while ((oneByte=in.read())!=-1){
               out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        }
        catch (IOException e){
            System.out.println(e.getStackTrace());
        }
        finally {
            in.close();
            out.close();
        }
    }
}
