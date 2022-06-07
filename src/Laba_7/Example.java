package Laba_7;

public class Example {
    public static void main(String[] args) {
        SuperClassTest superClassObject = new SuperClassTest("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        SubClassTest subClassObject1 = new SubClassTest("передал в конструктор подкласса");
        String subClassName1 = subClassObject1.toString();
        System.out.println(subClassName1);

        SubClassTest subClassObject2 = new SubClassTest ("передал в конструктор класса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}

