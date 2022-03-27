package Laba_9.Task_1;


//        Сгенерировано и перехвачено RuntimeException
//        Выполнить примеры 1-14 лабораторной работы, дав
//        письменно объяснения (в комментариях к коду) последовательности
//        выполняемых команд.

public class RunEx1 {
    public static void main(String[] args) {

        //Запускаем блок проверки, который выполняется до генерации ошибки
        try {
            System.out.println("0");

        //Возникает экземпляр ошибки, который перебрасывает ход выполнения в блок catch
            throw new RuntimeException("Непроверяемая ошибка") {

            };
        }
        catch (RuntimeException e) {

        //Выполняется код в блоке catch
            System.out.println("1" + e);
        }

        //Выполняется код после блока catch
        System.out.println("2");
    }

}
