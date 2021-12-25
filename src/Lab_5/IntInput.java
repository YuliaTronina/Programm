package Lab_5;

public class IntInput {
    private int i;
    private int j;

    public IntInput() {
        i=3;
        j=4;
    }

    public IntInput(int i) {
        this.i = i;
    }

    public IntInput(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
