package Laba_8;


//создание списка с головы и добавление произвольного элемента
public class Node1Demo4 {
    public static void main(String[] args) {
        Node newNode = new Node (44, null);

        Node head = new Node(0, null);
        Node tail = head;

        for (int i = 0; i<9; i++) {
            tail.next = new Node(i+1, null);
            tail = tail.next;
        }


        Node ref = head;
        int k = 1;

        while (ref.next!=null&&(k<2)){
            ref = ref.next;
            k++;
        }

        newNode.next = ref.next.next;
        ref.next = newNode;

        ref = head;
        while (ref!=null){
            System.out.println(ref.value);
            ref=ref.next;
        }
    }
}
