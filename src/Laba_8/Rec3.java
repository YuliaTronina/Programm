package Laba_8;

public class Rec3 {
    private static int step = 0;

    public static void l (int x) {
        space ();
        System.out.println(""+x+"->");
        step++;
        if ((2*x+1)<20){
            l(2*x+1);
        }
        step--;
        space();
        System.out.println(""+x+"<-");
    }

    public static void space () {
        for(int i =0; i<step;i++){
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        l(1);
    }

}
