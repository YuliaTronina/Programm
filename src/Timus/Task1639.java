package Timus;


import java.io.PrintWriter;
import java.util.Scanner;

public class Task1639 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int m = in.nextInt();
        int n = in.nextInt();

        String win;

        if ((m*n)%2==0|(m*n)==1){
            win = "[:=[first]";
        }
        else {
            win = "[second]=:]";
        }
        out.println(win);
        out.flush();
    }
}
