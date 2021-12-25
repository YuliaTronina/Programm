package Lab_5;

public class Task_4 {
    private char ch;
    private int i;

    public char getCh() {
        return ch;
    }

    public int getI() {
        return i;
    }

    public Task_4(char ch, int i) {
        this.ch = ch;
        this.i = i;
    }

    public Task_4 (double n) {
        this.ch = (char) ((int)n);
        this.i = (int) ((n % ((int) n))*100);
    }

}
