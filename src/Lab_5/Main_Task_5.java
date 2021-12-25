package Lab_5;

public class Main_Task_5 {
    public static void main(String[] args) {
        Task_5 task = new Task_5();
        task.setNumber();
        System.out.println("Значение поля = " + task.getNumber());
        task.setNumber(99);
        System.out.println("Значение поля = " + task.getNumber());
        task.setNumber(150);
        System.out.println("Значение поля = " + task.getNumber());

        Task_5 task1 = new Task_5();
        System.out.println("Значение поля = " + task1.getNumber());

        Task_5 task2 = new Task_5(155);
        System.out.println("Значение поля = " + task2.getNumber());

    }
}
