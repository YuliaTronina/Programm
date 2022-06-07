package Timus;

//Всё, что от вас требуется — найти сумму всех целых чисел, лежащих между 1 и N включительно.

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1068 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long sum = 0;
        int n = in.nextInt();
        int k=0;


        if(n>0){
            k=n;
        }
        else {
            k=-n+2;
        }


        sum = ((1+n)*k)/2;


        out.println(sum);
        out.flush();
    }
}
