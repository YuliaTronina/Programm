package Laba_11.Examples;

import java.io.*;
import java.net.URL;

//Отличие от работы программы,в примере 2 ЛР № 10 заключается в том, что в примере 2 ЛР10 использовались тоьлко байтовые
//потоки, без преобразования их в символьные

//Пример 3. Прочитать и вывести на экран информацию из трех источников: файла на диске, интернет-страницы и массива
// данных типа byte. Указать кодировку, поддерживающую кириллицу. (Сравнить с работой программы, приведенной в примере
// 2 в лабораторной работе No10 (1)).

public class InConvertInText {
    public static void readAllByByte (Reader in) throws IOException {
        while (true){
            int oneByte = in.read(); //читает 1 байт
            if (oneByte!=-1){
                System.out.print((char) oneByte);
            }
            else {
                System.out.print("\n"+ " конец ");
                break;
            }
        }
    }


    public static void main(String[] args) throws IOException{
        try{
            //связываем с потоком файл
            InputStream inFile = new FileInputStream ("MyFile1.txt"); //байтовый поток
            Reader rFile = new InputStreamReader(inFile, "cp1251"); //символьный поток с русской кодировкой

            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();

            //связываем с потоком интернет страницу
            InputStream inUrl = new URL("https://www.moex.com/").openStream(); //байтовый поток
            Reader rUrl = new InputStreamReader (inUrl, "cp1251"); //символьный поток

            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();

            //связывает поток с байтовым массивом
            InputStream inByteArray = new ByteArrayInputStream(new byte [] {1,2,3,9,8,10,12}); //байтовый поток
            Reader rByteArray = new InputStreamReader(inByteArray,"cp1251");        //символьный поток

            readAllByByte(rByteArray);
            System.out.print("\n\n\n");
            inByteArray.close();
            rByteArray.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
