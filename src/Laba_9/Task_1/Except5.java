package Laba_9.Task_1;

//        Исключение IllegalArgumentException – неверные аргументы.
//        Выполнить примеры 1-14 лабораторной работы, дав
//        письменно объяснения (в комментариях к коду) последовательности
//        выполняемых команд.

public class Except5 {
    //Создаем метод m() с аргументами строки и числа со знаками после запятой, в болке метода с помощью логического
    // оператора if проверяем, является ли значение в строке null, если да, то создается ошибка, причем если строка
    // null, то проверка второго условия не осуществляется, то же самое с числом.


    public static void m(String str, double chislo){
        if (str == null){
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if(chislo == 0){
            throw new IllegalArgumentException("Число введено неверно");
        }
    }

    public static void main(String[] args) {
        m("",0);
    }




}
