package Laba_8;

//создание списка с хвоста и добавление элемента в конец списка
public class Node1Demo3 {
    public static void main(String[] args) {
        Node head = null;
        for (int i = 3; i>=0; i--){
            head = new Node(i,head);
        }

        Node ref = head;
        while (ref!=null){
            System.out.println(ref.value);
            ref = ref.next;
        }

        System.out.println();

        Node newTail = new Node(145,null);

        ref = head;
        while (ref.next!=null){
            ref = ref.next;
        }
        ref.next = newTail;

        ref = head;
        while (ref!=null){
            System.out.println(ref.value);
            ref=ref.next;
        }

    }
}
