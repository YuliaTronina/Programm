
// В программе в примере 7 изначально используется символьный поток, классы и методы, относящиеся к этому потоку.
// В примере 8, изначально используется байтовый поток, классы и методы, относящиеся к байотвому потоку. При этом, в метод
// readAllByByte передается символьный поток. Для перевода байтоврго потока в симврльный используется InputStreamReader


package Laba_10.Example;

import java.io.*;
import java.net.URL;

public class InConvertInText {

    public static void readAllByByte (Reader in) throws IOException{
        while (true) {
            int oneByte = in.read();
            if (oneByte!=-1){
                System.out.println((char) oneByte);
            }
            else {
                System.out.println("\n" + " конец ");
                break;
            }
        }

    }

    public static void main(String[] args) {
        try {

           //Связывание потока с файлом
            InputStream inFile = new FileInputStream("MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile,"cp1251");
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();

            //Связывание потока с интернет-страницей
            InputStream inURL = new URL("https://www.moex.com/").openStream();
            Reader rUrl = new InputStreamReader(inURL, "cp1251");
            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inURL.close();
            rUrl.close();

            //Связывание потока с байтовым массивом
            InputStream inArray = new ByteArrayInputStream (new byte[] {5,1,2,3,8,9});
            Reader rArray = new InputStreamReader(inArray);
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();

        }
        catch (IOException e){
            System.out.println("Ошибка: " + e);
        }
    }
}

