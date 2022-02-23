package Laba_7;

public class Main_Task3 {
    public static void main(String[] args) {
        SuperClass_Task3 superClassObj = new SuperClass_Task3(12);
        System.out.println("Переопределенный метод toString для суперкласса " + superClassObj.toString());
        superClassObj.setNum(5);
        System.out.println("Новое значение параметра суперкласса - " + superClassObj.toString());
        System.out.println();

        SubSuperClass_Task3 subSuperClassObj = new SubSuperClass_Task3(12, 'a');
        System.out.println("Переопределенный метод toString для первого подкласса " + subSuperClassObj.toString());
        subSuperClassObj.setNum(3,'j');
        System.out.println("Новые значения параметров первого подкласса - " + subSuperClassObj.toString());
        System.out.println();

        SubClass_Task3 subClassObj = new SubClass_Task3(9, 'U',"3 level");
        System.out.println("Переопределенный метод toString для второго подкласса " + subClassObj.toString());
        subClassObj.setNum(1,'t',"new level");
        System.out.println("Новые значения параметров второго подкласса - " + subClassObj.toString());
        System.out.println();

    }
}
