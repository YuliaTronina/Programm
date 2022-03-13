package Laba_8.Task_6;


public class ListMainRec {
    public static void main(String[] args) {
    ListMethodsRecursion.createHeadRec(2);
    System.out.println();
    ListMethodsRecursion.toStringRec(ListMethodsRecursion.createHeadRec(2));
    ListMethodsRecursion.toStringRecTail(ListMethodsRecursion.createTailRec(3));


    }
}
