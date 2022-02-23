package Laba_7;

public class Main_Task4 {
    public static void main(String[] args) {
        SuperClass_Task4 superClassObj = new SuperClass_Task4 ('w');
        SuperClass_Task4 superClassObjCopy = new SuperClass_Task4 (superClassObj);

        superClassObj.show();
        superClassObjCopy.show();
        System.out.println();

        SubSuperClass_Task4 subSuperClassObj = new SubSuperClass_Task4 ('b', "первый подкласс");
        SubSuperClass_Task4 subSuperClassObjCopy = new SubSuperClass_Task4(subSuperClassObj);

        subSuperClassObj.show();
        subSuperClassObjCopy.show();
        System.out.println();

        SubClass_Task4 subClassObj = new SubClass_Task4('t', "второй подкласс", 12);
        SubClass_Task4 subClassObjCopy = new SubClass_Task4(subClassObj);

        subClassObj.show();
        subClassObjCopy.show();
    }
}
