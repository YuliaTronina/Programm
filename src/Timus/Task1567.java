package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1567 {
    public static void main(String[] args) {
        char [] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',':','.',',','!',' '};

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String str = in.nextLine();
        char [] strChar = str.toCharArray();
        int sum = 0;
        int sumS=0;

        for (int i = 0; i< strChar.length;i++){
            for (int j=0;j<ch.length;j++){
                if (strChar[i]==ch[j]) {
                    if ((j+1)%3==1){
                        sumS=1;
                    }
                    else if((j+1)%3==0){
                        sumS = 3;

                    }
                    else {
                        sumS = 2;

                    }

                    sum = sum+sumS;
                    break;
                }
            }
        }
        out.println(sum);
        out.flush();
    }
}
