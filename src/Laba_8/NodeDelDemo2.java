package Laba_8;

public class NodeDelDemo2 {
    public static void main(String[] args) {
        Node head = new Node(0,null);
        Node tail = head;

        for (int i = 0; i<9; i++) {
            tail.next = new Node (i+1, null);
            tail = tail.next;
        }

        Node ref = head;
        int k = 1;
        while (ref.next!=null&&(k<2)){
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;

        ref=head;
        while (ref!=null){
            System.out.println(ref.value);
            ref=ref.next;
        }
    }
}
