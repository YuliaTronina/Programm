package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();

        out.println(n*(m+1));
        out.flush();
    }

}
