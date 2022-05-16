package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1263 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();

        int [] cand = new int[n];
        int [] izb = new int[m];


        for (int i=0;i<izb.length;i++){
            izb [i] = in.nextInt();
        }

        int z=0;
        for (int i=0;i<izb.length;i++){
            for (int j=0;j<cand.length;j++){
                if (izb[i]==j+1){
                    cand [j]++;
                }
            }
        }


        for (int i =0;i< cand.length;i++){
            double per =(double) cand[i]/m*100;
            String str = String.format("%.2f",per);
            out.println(str+"%");
        }

        out.flush();

    }
}
