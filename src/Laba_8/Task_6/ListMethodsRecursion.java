package Laba_8.Task_6;

public class ListMethodsRecursion {
    static int i = 0;
    static int r = 0;
    static int m = 0;
    static int n = 0;
    static Node head;
    static Node headTail;
    static String str = "";
    static Node ref;
    static ListMethodsRecursion listRecHead;
    static ListMethodsRecursion listRecTail;
    static Node tail;


    // создаем класс и конструктор класса узлов с указанием полей значения и следующего элемента списка
    public static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //метод для создания односвязанного списка, заданной длины, с начала списка
    public static ListMethodsRecursion createHeadRec(int numbers) {
        while (i == 0) {
            listRecHead = new ListMethodsRecursion();
            head = new Node(0, null);
            tail = head;
            i++;
        }

        tail.next = new Node( 2*i, null);
        i++;

        if (i < (numbers+1)) {
            tail = tail.next;
            createHeadRec(numbers);
        }

        return listRecHead;
    }

//Метод для ввода односвязного списка, заданной длины, с хвоста
    public static ListMethodsRecursion createTailRec (int numbers){
       while (r==0) {
           headTail = null;
           listRecTail = new ListMethodsRecursion();
           r=numbers;
       }
        headTail = new Node(r,headTail);
        r--;

        if (r>0){
            createTailRec(numbers);
        }

        return listRecTail;
    }



// Метод для вывода списка в строку
    public static String toStringRec (ListMethodsRecursion listRec) {

        while (m==0) {
                ref = listRec.head;
                m++;
            }

            str = str + ref.value + " ";

           if (ref.next!=null) {
               ref= ref.next;
               toStringRec(listRec);
        }

        return str;
    }

    public static String toStringRecTail (ListMethodsRecursion listRec) {

        while (n==0) {
            ref = listRec.headTail;
            n++;
        }

        str = str + ref.value + " ";

        if (ref.next!=null) {
            ref= ref.next;
            toStringRec(listRec);
        }

        return str;
    }

}
