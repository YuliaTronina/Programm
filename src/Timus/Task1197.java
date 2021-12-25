package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();//Количество тестов
        String [] Test = new String[n];
        int [] Ans = new int[n];

        for (int i = 0; i<n;i++){
            Test [i] = in.next();
        }

        char [][] TestNew = new char [n][2];
        for (int i=0; i<TestNew.length;i++){
            TestNew [i] = Test[i].toCharArray();
            }

        for (int i=0;i< TestNew.length;i++){
            if ((TestNew[i][0] =='a')|(TestNew[i][0] =='h')|(TestNew[i][1] == '1')| (TestNew[i][1] =='8')){
                Ans[i] = 2;
                continue;
            }

            if((TestNew[i][0] =='b')&(TestNew[i][1] =='2')|(TestNew[i][0] =='b')&(TestNew[i][1] =='7')|(TestNew[i][0] =='g')&(TestNew[i][1] =='2')|(TestNew[i][0] =='g')&(TestNew[i][1] =='7')){
                Ans [i] = 4;
                continue;
            }

            if ((99<=TestNew[i][0])&(TestNew[i][0]<=103)&(TestNew[i][1]=='2')|(99<=TestNew[i][0])&(TestNew[i][0]<=103)&(TestNew[i][1]=='7')|(50<TestNew[i][1])&(TestNew[i][1]<55)&(TestNew[i][0]=='b')|(50<TestNew[i][1])&(TestNew[i][1]<55)&(TestNew[i][0]=='g')){
                Ans [i] = 6;
                continue;
            }

            else {
                Ans [i] = 8;
            }
        }

        for (int i = 0;i<n; i++){
            out.println(Ans [i]);
        }
        out.flush();
    }
}
