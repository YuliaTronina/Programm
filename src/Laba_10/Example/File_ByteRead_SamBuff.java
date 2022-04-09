package Laba_10.Example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File_ByteRead_SamBuff {
    // Считываем по 5 символов (буфер)
    public static void readAllByArray (InputStream in) throws IOException {
        byte [] buff = new byte[5];
        while (true) {
            int count =in.read();
            if(count!=-1){      // Проверка конца файла
                System.out.println("количество = " + count + ", buff = "
                                    + Arrays.toString(buff)); // UTF8
            }
            else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        String fileName = "MyFile1.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла" + fileName + e);
        } finally {
            if (inFile != null) {
                try {
                inFile.close();
                }
                catch (IOException e) {
                    /*NOP*/
                }
            }
        }

    }
}
