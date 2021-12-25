package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        if(a<=4){
            out.println("few");
           }

        if((a>4)&(a<=9)) {
            out.println("several");
        }
        if((a>9)&(a<=19)) {
            out.println("pack");
        }

        if((a>19)&(a<=49)) {
            out.println("lots");
        }
        if((a>49)&(a<=99)) {
            out.println("horde");
        }
        if((a>99)&(a<=249)) {
            out.println("throng");
        }
        if((a>249)&(a<=499)) {
            out.println("swarm");
        }
        if((a>499)&(a<=999)) {
            out.println("zounds");
        }
        if(a>999) {
            out.println("legion");
        }

        out.flush();
    }
}
