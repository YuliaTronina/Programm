package Lab_5;

public class Main_Task_6 {
    public static void main(String[] args) {
        Task_6 task = new Task_6 ();
        task.compare(-5);
        task.print();

        task.compare(12,-5);
        task.print();

        Task_6 task1 = new Task_6(100);
        task1.print();

        Task_6 task2 = new Task_6(100,-5);
        task2.print();
    }
}
