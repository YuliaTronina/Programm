package Laba_9.Task_1;

//        Перехват исключения подходящим классом.
//        Выполнить примеры 1-14 лабораторной работы, дав
//        письменно объяснения (в комментариях к коду) последовательности
//        выполняемых команд.

public class RunEx3 {
    public static void main(String[] args) {

    //Блок кода, в котором проверяется наличие исключений, выполняется последовательно до возникновения исключения
    //затем выполнение переходит в блок catch
        try{
            System.out.println("0");

    //Создание исключения
            throw new RuntimeException("Непроверяемая ошибка");
        }

    //Выполняется блок кода проверки исклюлчения на RuntimeException, завершается блок проверки ошибок,
    // те в catch (Exception e) на заходит
    //при этом блок кода catch (Exception e) может быть выполнен, в случае другой (не RuntimeException), относяшейся к
    // Exception, если бы блоки проверки были поменяны местами, то программа бы не исполнялась.

    catch (RuntimeException e) {
        System.out.println("2");
    }

    catch (Exception e) {
        System.out.println("3");
    }

        System.out.println("4");
    }

}
