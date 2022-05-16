package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] N = new int[n];
        int sum = 0;
        int three_count = 0;
        int five_count =0;
        String st = null;

        for (int i = 0;i<N.length;i++){
            N[i]=in.nextInt();
        }

        for(int i=0;i<N.length;i++){
            if(N[i] == 3){
                three_count++;
            }
            if(N[i]==5){
                five_count++;
            }
            sum = sum + N[i];

        }


        if(three_count==0){
            if(five_count==n){
                st = "Named";
            }
            else if ((double)sum/n>=4.5){
                st = "High";
            }
            else {
                st = "Common";
            }
        }
        else{
            st = "None";
        }

       out.println(st);
        out.flush();

    }
}
