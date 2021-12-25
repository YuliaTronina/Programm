package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int f = in.nextInt();
        String ans = "YES";

        if ((12-f)*0.75>=4) {
            ans = "NO";
        }

        out.println(ans);
        out.flush();
    }
}
