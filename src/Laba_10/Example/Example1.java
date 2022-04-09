package Laba_10.Example;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example1 {
    //Метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte (InputStream in) throws IOException{
        while (true){
            int oneByte = in.read(); // Читает 1 байт
            if (oneByte!=-1){        // признак отсутсвия конца файла
                System.out.print((char) oneByte);
            }
            else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try{
        // Создаем поток и связываем его с файлом
        InputStream inFile = new FileInputStream ("MyFile1.txt");
        readAllByByte(inFile);
        System.out.println("\n\n\n");
            inFile.close();

        // Связываем поток с интернет-страницей
        InputStream inURL = new URL("https://www.moex.com/").openStream();
        readAllByByte(inURL);
            System.out.println("\n\n\n");
        inURL.close();

        //Связываем поток с массивом типа byte
        InputStream inByteArray = new ByteArrayInputStream(new byte[]{1,2,3,5,6,9,8,7});
        readAllByByte(inByteArray);
            System.out.println("\n\n\n");
        inByteArray.close();

        }
        catch (IOException e) {
            System.out.println("Ошибка:" + e);
        }
    }


}
