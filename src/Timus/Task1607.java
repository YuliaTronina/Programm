package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int price =0;

        if (a<c) {
            while (a <= c) {
               if (a+b<=c){
                   a = a + b;
                   price =a;
               }
               else {
                   price = c;
                   break;
               }
               if (c-d>=a){
                   c=c-d;
                   price =c;
               }
               else {
                   price =a;
                   break;
               }

            }
        }
        else {
            price = a;
        }

        out.println(price);
        out.flush();

    }
}
