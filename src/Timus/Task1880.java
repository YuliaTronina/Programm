package Timus;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1880 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int n = in.nextInt();
        int [] N = new int[n];
        for (int i=0;i<N.length;i++){
            N[i] = in.nextInt();
        }
        Arrays.sort(N);


        int k = in.nextInt();
        int [] K = new int[k];
        for (int i=0;i<K.length;i++){
            K[i] = in.nextInt();
        }
        Arrays.sort(K);


        int m = in.nextInt();
        int [] M = new int[m];
        for (int i=0;i<M.length;i++){
            M[i] = in.nextInt();
        }
        Arrays.sort(M);

        ArrayList<Integer> setNK = new ArrayList<>();


        for (int i=0;i<N.length;i++){
            for (int j=0;j<K.length;j++){
                if(N[i]==K[j]){
                    setNK.add(N[i]);
                    break;
                }
            }
        }

        ArrayList<Integer> set1 = new ArrayList<>();
        for (int i=0;i<setNK.size();i++){
            for (int j=0;j<M.length;j++){
                if(setNK.get(i) ==M[j]){
                    set1.add(M[j]);
                    break;
                }
            }
        }
        out.println(set1.size());
        out.flush();
    }
}
