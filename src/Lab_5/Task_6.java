package Lab_5;

public class Task_6 {
    private int min;
    private int max;

    public void compare (int max) {
        this.min = 0;
        this.max = max;
        if (this.min>max){
            this.min = max;
            this.max = 0;
        }
    }

    public void compare (int min, int max) {
        this.min = min;
        this.max = max;

        if (min>max){
            this.min = max;
            this.max = min;
        }
    }

    public Task_6() {
    }

    public Task_6(int max) {
        this.min = 0;
        this.max = max;
        if (this.min>max){
            this.min = max;
            this.max = 0;
        }
    }

    public Task_6(int min, int max) {
        this.min = min;
        this.max = max;
        if (min>max){
            this.min = max;
            this.max = min;
        }
    }

    public void print (){
        System.out.println("Минимальное значение = "+ this.min + ", максимальное значение = " + this.max);
    }
}
