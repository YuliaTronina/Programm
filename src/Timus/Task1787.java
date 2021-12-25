package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1787 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     PrintWriter out = new PrintWriter(System.out);

    int k = in.nextInt();
    int n = in.nextInt();
    int sumCar = 0;

    int [] CarQuantity = new int[n];
    for (int i = 0;i<n;i++){
        CarQuantity[i] = in.nextInt();
    }

    for (int i = 0; i<n; i++){
        sumCar = sumCar + CarQuantity [i] - k;

        if(sumCar <0){
            sumCar=0;
        }
    }


     out.println(sumCar);
     out.flush();
    }
}
