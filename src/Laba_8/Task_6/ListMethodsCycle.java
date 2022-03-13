package Laba_8.Task_6;


public class ListMethodsCycle {
static Node head;

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
    public static ListMethodsCycle createHead(int numbers) {
        ListMethodsCycle list = new ListMethodsCycle();
        head = new Node(0, null);
        Node tail = head;

        for (int i = 0; i < numbers - 1; i++) {
            tail.next = new Node(i + 1, null);
            tail = tail.next;
        }

        return list;
    }


//Метод для ввода односвязного списка, заданной длины, с хвоста
    public static ListMethodsCycle createTail (int numbers){
        Node head = null;
        ListMethodsCycle list = new ListMethodsCycle();

        for (int i = numbers-1; i>=0;i--){
            head = new Node (2*i,head);
        }
        return list;
    }

// Метод для вывода списка в строку
    public static String toString (ListMethodsCycle list) {

    Node ref = list.head;
    String str ="";

    while (ref!=null){
        str = str + ref.value + " ";
        ref = ref.next;
    }
    return str;
 }

 // Метод для определения длины списка
    public static int listLenght (ListMethodsCycle list) {
        Node ref = list.head;
        int i=0;

        while (ref!=null){
            ref = ref.next;
            i++;
        }
        return i;
    }

 // Метод для добавления элемента в начало списка
    public static ListMethodsCycle AddFirst (ListMethodsCycle list, int value){
       head = new Node(value, head);

       return list;
    }


// Метод для добавления элемента в конец списка
    public static ListMethodsCycle AddLast (ListMethodsCycle list, int value) {

    Node newTail = new Node (value,null);
    Node ref = head;

        while (ref.next!=null){
           ref = ref.next;
        }
        ref.next = newTail;

    return list;
    }

// Метод для добавления элемента с указанным номером
   public static ListMethodsCycle Insert (ListMethodsCycle list, int place, int value) {
    Node newNode = new Node(value, null);
    Node ref = head;
    int k = 1;

    if (place<=listLenght(list)){
        while (ref.next!=null&&(k<place)){
        ref = ref.next;
        k++;
        }

        newNode.next = ref.next.next;
        ref.next = newNode;

        return list;
    }

    else {
        System.out.println("Недопустимое значение для вставки");
        return list;
    }
}

//метод для удаления 1 элемента списка
    public static ListMethodsCycle RemoveFirst (ListMethodsCycle list){
        head = head.next;
        return list;
    }


//метод для удаления последнего элемента списка
        public static ListMethodsCycle RemoveLast (ListMethodsCycle list) {
        Node ref = head;

        while (ref.next.next!=null){
            ref = ref.next;
        }
        ref.next = null;
        return list;
     }

//Метод для удаления произвольного элемента списка
    public static ListMethodsCycle Remove (ListMethodsCycle list, int place) {
        if (place<listLenght(list)) {
            Node ref = head;
            int k = 1;
            while (ref.next!=null&&(k<place)){
                ref =ref.next;
                k++;
            }
            ref.next = ref.next.next;

            return list;
        }
        else {
            System.out.println("Недопустимый элемент для удаления");
            return list;
        }
        }



}
