package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1877 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);


            int kod1 = in.nextInt();
            int kod2 = in.nextInt();

            String ans = "no";

            if (((kod1%2) == 0)|((kod2%2) == 1)){
            ans = "yes";
        }
            out.println(ans);
            out.flush();
        }
}
