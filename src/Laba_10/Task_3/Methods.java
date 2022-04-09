package Laba_10.Task_3;

import java.util.ArrayList;

// Создадим метод, который проверяет начальную букву слова на согласность и, если слово удовлетворяет заданному условию,
// (далее - условие), записывает его в ArrayList.

public class Methods {
    // Метод, возвращающий ArrayList. в него передается строка и разделитель слов в строке
    public static ArrayList findSoglWord (String str, String split){

        //Создаем массив согласных букв
        char [] soglArray = {'б','в', 'г','д','ж','з','й','к','л','м','н','п','р','с','т','ф','х','ц','ч','ш','щ'};
        //Создаем массив из слов в переданнй строке, которые разделены указанным символом.
        String [] words = str.split(split);
        //Создаем ArrayList из строк для записи в не
        ArrayList <String> wordsNew = new ArrayList<>();

        // Передираем все слова массива из строк первоначальной строки на соответствие условию, в случае соответствия
        // добавляет слово в ArrayList.
        for (int i=0; i<words.length; i++){
            for (int j=0;j<soglArray.length; j++){
                if (words[i].toLowerCase().charAt(0) == soglArray[j]) {
                    wordsNew.add(words[i]);
                    break;
                }
            }
        }
        return wordsNew;
    }

    //Строковый метод для преобразования ArrayList в строку
    public static String toString(ArrayList strArray) {
        String str="";

        for (Object x:strArray){
            str = str +" "+x;
        }


        return str;
    }
}
