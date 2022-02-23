package Laba_7;

public class Main_Task5 {
    public static void main(String[] args) {
        SuperClass_Task5 superClassObj = new SuperClass_Task5("суперкласс");
        System.out.println(superClassObj.toString());

        SubSuperClass1_Task5 subSuperClass1Obj = new SubSuperClass1_Task5("подкласс_1", 11);
        System.out.println(subSuperClass1Obj.toString());

        SubSuperClass2_Task5 subSuperClass2Obj= new SubSuperClass2_Task5("подкласс_2", 'd');
        System.out.println(subSuperClass2Obj.toString());
        System.out.println();

        SuperClass_Task5 superClassObjEx;
        superClassObjEx = subSuperClass1Obj;
        System.out.println("Переменная суперкласса ссылается на объект подкласса 1 : " + superClassObjEx.toString());
        System.out.println();

        superClassObjEx = subSuperClass2Obj;
        System.out.println("Переменная суперкласса ссылается на объект подкласса 2: " + superClassObjEx.toString());
    }
}
