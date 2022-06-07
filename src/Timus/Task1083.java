package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1083 {

    public static long fact (int n,int f){
        if(n<=0){
            return 1;
        }
        else {
            return fact (n-f,f)*n;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        String str = in.next();
        int f = 0;

        char [] ch = str.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]=='!'){
                f++;
            }
        }


        out.println(fact(n,f));
        out.flush();


    }
}
