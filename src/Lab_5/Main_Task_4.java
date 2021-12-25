package Lab_5;

public class Main_Task_4 {
    public static void main(String[] args) {
        Task_4 task = new Task_4('A',12);
        System.out.println("private char = "+task.getCh());
        System.out.println("private int = "+task.getI());

        Task_4 task1 = new Task_4(64.34536);
        System.out.println("private char = "+task1.getCh());
        System.out.println("private int = "+task1.getI());
      }
}
