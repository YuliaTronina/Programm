package Laba_9.Task_1;

//        ример работы с аргументами метода main. На рисунке 5 представлена настройка проекта и задание входных
//        значений аргументов.
//        Выполнить примеры 1-14 лабораторной работы, дав
//        письменно объяснения (в комментариях к коду) последовательности
//        выполняемых команд.

public class Except6 {
    // Создается блок try{}, в котором осуществляется проверка возникновения ошибок: арифметической - деление на ноль
    // (если мы не передаем аругемниты главного метода, те i=0) и неправильный индекс элемента в массие (если i=0.55).
    // после выявления ошибки программа перебрасывается в болок catch(). который выводит сообщение, соответствующее
    // ошибке.

    public static void main(String[] args) {
        try{
            int i = args.length; //вводится и инициализируется переменная i, которая инициализируется значением длины
                                 // массива args[]
            System.out.println("размер массива " + i);
            int h = 10/i;

            args[i+1]="10";
        }

        catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс не существует");
        }
    }
}
