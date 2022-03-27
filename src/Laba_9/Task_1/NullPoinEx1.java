package Laba_9.Task_1;

//        Последовательность перехвата должна соответствовать иерархии классов исключений. Предок не должен
//        перехватывать исключения раньше потомков. Указанный пример выдает ошибку компилятора.
//        Программу запустить невозможно.
//        Выполнить примеры 1-14 лабораторной работы, дав
//        письменно объяснения (в комментариях к коду) последовательности
//        выполняемых команд.

public class NullPoinEx1 {
    public static void main(String[] args) {
    //Создаем блок кода, в котором проверяется наличие исключений. Создаем исключение типа NullPointerException.
    // Блок кода выполняется последовательно до возникновения исключения и переходит в блок catch. Тк блок
    // catch (Exception e) - является суперклассом RuntimeExсeption, который в свою очередь является суперклассом
    // NullPointerException, то следующие блоки кода (после catch (Exception e)) с catch не будут выполняться никогда,
    // что приводит к ошибке компиляции. Если закомментировать часть кода (см. ниже), то ошибка исчезает, тк после
    // суперкласса не проверяется подкласс.

        try {
            System.out.println("0");
            throw new NullPointerException ("ошибка");
        }

        catch (ArithmeticException e){
            System.out.println("1");
        }

        catch (Exception e){
            System.out.println("2");
        }

//        catch (RuntimeException e){
//            System.out.println("3");
//        }

        System.out.println("4");
    }
}