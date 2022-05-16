package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int [] N = new int[n];

        for (int i=0; i<N.length;i++){
            N[i]=in.nextInt();
        }

        int number=0;
        long sum = 0;

        for (int i=0;i<N.length-2;i++){
            long sum1=N[i]+N[i+1]+N[i+2];
            if(sum1>sum){
                sum=sum1;
                number = i+2;
            }
        }

        System.out.println();
        out.println(sum+" "+ number);
        out.flush();
    }
}
