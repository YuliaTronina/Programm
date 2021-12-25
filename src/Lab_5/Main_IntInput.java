package Lab_5;

public class Main_IntInput {
    public static void main(String[] args) {
        IntInput intInput = new IntInput();
        System.out.println("первое число - "+intInput.getI()+", второе число - " + intInput.getJ());

        IntInput intInput1 = new IntInput(12);
        System.out.println("первое число - "+intInput1.getI()+", второе число - " + intInput1.getJ());

        IntInput intInput2 = new IntInput(12,15);
        System.out.println("первое число - "+intInput2.getI()+", второе число - " + intInput2.getJ());
    }
}
