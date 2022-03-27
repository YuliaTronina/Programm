package Laba_9.Task_1;

//        Нельзя перехватить брошенное исключение с помощью чужого catch, даже если перехватчик подходит.
//        Выполнить примеры 1-14 лабораторной работы, дав
//        письменно объяснения (в комментариях к коду) последовательности
//        выполняемых команд.

public class NullPoinEx2 {
    public static void main(String[] args) {
    //Создаем блок кода try{}, в котором проверяется наличие ошибок. Создаем ошибку типа NullPointerException.
    // Блок кода последовательно выполняется до встречи с ошибкой, после чего перебрасывается в блок catch с подходящим
    // типом ошибки. Блок catch последовательно выполняется до возникновения исключения, которое не перехватывается,
    // после чего возникает ошибка, следующие блоки кода не выполняются.

    try {
        System.out.println("0");
        throw new NullPointerException ("ошибка");
    }

    catch (NullPointerException e){
        System.out.println("1");
        throw new ArithmeticException("арифметическая ошибка");
    }

    catch (ArithmeticException e){
        System.out.println("2");
    }

        System.out.println("3");
    }
}
