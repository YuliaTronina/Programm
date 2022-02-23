package Laba_7;

public class Main_Task2 {
    public static void main(String[] args) {
        SuperClass_Task2 superClass_Object1 = new SuperClass_Task2("Параметр суперкласса");
        System.out.println("Начальный параметр суперкласса - " + superClass_Object1.getStr1());
        System.out.println("Длина строки - "+ superClass_Object1.stringLenght()+"\n");

        superClass_Object1.setStr1WithAut();
        System.out.println("Метод без параметров для суперкласса - " + superClass_Object1.getStr1());
        System.out.println("Длина строки - "+ superClass_Object1.stringLenght()+"\n");

        superClass_Object1.setStr1("Новый параметр суперкласса");
        System.out.println("Метод с одним параметром для суперкласса - " + superClass_Object1.getStr1());
        System.out.println("Длина строки - "+ superClass_Object1.stringLenght()+"\n");

        SubClass_Task2 subClass_Object = new SubClass_Task2("Параметр подкласса",12);

        subClass_Object.setStr1WithAut();
        System.out.println();

        subClass_Object.setStr1("Новый параметр подкласса");

        System.out.println("Перегруженный метод с числовым параметром, целое число - " + subClass_Object.setStr1(11)+"\n");

        System.out.println("Перегруженный метод c числовым и текстовым параметром - " + subClass_Object.setStr1("Новый текстовый параметр", 13)+"\n");

    }
}
