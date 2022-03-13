package Laba_8;

//создание списка с хвоста и добавление элемента в начало списка
public class Node1Demo2 {
    public static void main(String[] args) {
        Node head = null;
        for (int i = 9; i>=0; i--){
            head = new Node(i,head);
        }

        Node ref = head;
        while (ref!=null){
            System.out.println(ref.value);
            ref = ref.next;
        }

        System.out.println();

        head = new Node(123, head);

        Node ref1 = head;
        while (ref1!=null){
            System.out.println(ref1.value);
            ref1= ref1.next;
        }
    }
}
