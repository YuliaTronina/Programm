package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        double n = in.nextInt();
        double k = in.nextInt();
        int x;
        if (n<k){
            x=2;
        }
            else {
            x = (int) Math.ceil(2 * n / k);
        }

        out.println(x);
        out.flush();
    }
}
