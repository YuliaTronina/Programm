package Laba_9.Task_1;

//        Исключение не перехвачено.
//        Выполнить примеры 1-14 лабораторной работы, дав
//        письменно объяснения (в комментариях к коду) последовательности
//        выполняемых команд.

public class RunEx5 {
    public static void main(String[] args) {

    //Создаем блок кода, в котором проверяется наличие исключений. Создаем исключение типа RuntimeException.
    //Код выполняется последовательно до момента появления исключения, после этого переходи к блокам catch,
    //которые также проверяет последоватеельно до момента, пока не встретит подходящий тип ошибки, следующие блоки catch
    // не проверяются.


        try {
            System.out.println("0"); //выводится, тк до возникновения исключения
            throw new RuntimeException ("ошибка"); // после этой строки в блоке try{} ничего выводиться не будет.
        }

        catch (NullPointerException e) {//не выводится, тк исключение в блоке try{} не соответсвует заявленному типу ошибки.
            System.out.println("1");
        }

        System.out.println("2");//не выводится, тк блока-перехватчика ошибки не найдено, возникает ошибка
    }
}
