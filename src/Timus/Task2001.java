package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a;
        int b;

        int a1 = in.nextInt();
        int b1 = in.nextInt();

        int a2 = in.nextInt();
        int b2 = in.nextInt();

        int a3 = in.nextInt();
        int b3 = in.nextInt();

        a=a1-a3;
        b=b1-b2;

        out.print(a + " " + b);
        out.flush();
    }
}
