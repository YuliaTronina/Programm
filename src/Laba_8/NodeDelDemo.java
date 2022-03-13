package Laba_8;

public class NodeDelDemo {
    public static void main(String[] args) {

        Node head = new Node(0, null);
        Node tail = head;

        for (int i = 0; i < 9; i++) {
            tail.next = new Node(i + 1, null);
            tail = tail.next;
        }

        head = head.next;

        Node ref = head;
        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }

        ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }

        ref.next = null;

        System.out.println();

        ref = head;
        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
