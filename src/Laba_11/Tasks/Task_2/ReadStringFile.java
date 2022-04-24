package Laba_11.Tasks.Task_2;

//Создать проект, позволяющий из одного текстового файла, содержащего несколько строк (тип String) заранее
// подготовленного текста на русском языке (обратитесь к классике), построчно переписать в другой текстовый файл
// слова, отвечающие условию. Условие:
//        Переписать в результирующий файл слова, которые начинаются с той же буквы, что и первое слово.
//        Требования:
//        – слова из предложения выделять методом split();
//        – в новом файле следует указать номер строки, в которой искомые слова находились в исходном файле;
//        – для каждой строки указать количество выбранных слов.

import java.io.*;

public class ReadStringFile {
    public static void main(String[] args) {

        try{
            //Создаем новый файл для записи результата
            File f1 = new File("MyFileRes_3.txt");
            f1.createNewFile();
            int stringCount = 0;
            String str=null;
            String string="";

            //Открываем поток для чтения из файла и записи в файл
            BufferedReader bf = new BufferedReader(new FileReader("MyFile3.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f1.getAbsolutePath()));

            //Ищем построчно, пока в файле не закончатся строки, считаем строки и слова, удовлетворяющие заданным
            // условиям. Записываем их в новую строку, которую записываем в рузультирующий файл.
            while ((str = bf.readLine())!=null){
                String [] strings = str.split(" "); //создаем массив из слов из каждой строки
                char ch = strings[0].toLowerCase().charAt(0);           //находим первую букву первого в строке слова
                String s= "";
                int wordCount = 0;
                stringCount++;                            //считаем строки
                for (String x: strings){      //ищем слова с подходящей буквы, записываем их в строку
                    if(x.toLowerCase().charAt(0)==ch){
                        wordCount++;
                        s=s + x+" ";
                    }
                }
                string = "Строка №" +stringCount +" из " + wordCount + " слов: " + s;
                bw.write(string);
                bw.newLine();
            }

            bf.close();
            bw.flush();
            bw.close();


        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
