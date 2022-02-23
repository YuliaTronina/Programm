package Laba_7;

public class Main_Task1 {
    public static void main(String[] args) {
        SuperClass_Task1 superClass_Object = new SuperClass_Task1("конструктор суперкласса");
        System.out.println(superClass_Object.toString());

        SubClass_Task1 subClass_Object1 = new SubClass_Task1("конструктор подкласса с одним параметром");
        System.out.println(subClass_Object1.toString());

        SubClass_Task1 subClass_Object2 = new SubClass_Task1("подкласс", "с 2 параметрами");
        System.out.println(subClass_Object2.toString());
    }
}
