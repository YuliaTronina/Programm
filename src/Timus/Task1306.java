package Timus;

//В первой строке входа содержится число N — длина последовательности. Во второй и последующих строках расположены сами
// элементы последовательности, по одному в каждой строке. Длина последовательности — целое число от единицы до 250 000.
// Каждый элемент последовательности — целое число от 0 до (231−1) включительно.

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1306 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        double [] N = new double [n];
        int number = 0;
        double mediana = 0;

        for (int i = 0;i<N.length;i++){
            N[i]=in.nextDouble();
        }

        Arrays.sort(N);

        if(N.length%2==0){
            number = N.length/2;
            mediana = (N[number]+N[number-1])/2;
        }
        else {
            number = n/2;
            mediana = N[number];
        }


        out.println(mediana);
        out.flush();

    }
}
