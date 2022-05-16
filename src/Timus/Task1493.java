package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1493 {
    public static boolean luckyTicket (int  x){
        String [] str = Integer.toString(x).split("");

        int size=0;
        if(str.length==5){
            size = 6;
        }
        else {
            size=str.length;
        }
        int [] numbers = new int[size];
        int sum1=0;
        int sum2=0;


        if (str.length == 5) {
            numbers[0] = 0;
            for (int i =1; i<numbers.length;i++) {
                    numbers[i] = Integer.valueOf(str[i-1]);

            }
        }
        else{
            for(int i =0;i<numbers.length;i++){
                numbers[i]=Integer.valueOf(str[i]);
            }
        }


        for (int i = 0; i<numbers.length;i++) {
            if (i < 3) {
                sum1 = sum1 + numbers[i];
            } else {
                sum2 = sum2 + numbers[i];
            }
        }

            if (sum1==sum2){
                return true;
            }
            else {
                return false;
            }
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        String ans=null;
        int n=in.nextInt();

        if(luckyTicket(n+1)|luckyTicket(n-1)){
            ans = "Yes";
        }
        else {
            ans = "No";
        }

        out.println(ans);
        out.flush();

    }
}
