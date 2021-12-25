package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class TasK2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int result = 0;

        int [] Result = {a-b+c,a+c-b,b-c+a,b+c-a,c-b+a,c+b-a,a*b-c,a*c-b,b*c-a,c*a-b, c-a*b,b-a*c,a-b*c,b-c*a};


     for (int i = 0; i<Result.length;i++){
           if (Result[i]<result){
                result = Result[i];
            }
       }

        out.println(result);
        out.flush();
    }
}
