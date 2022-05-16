package Timus;
//В первой строке записано целое число n — количество записей в блокноте (1 ≤ n ≤ 1000). В каждой из следующих n строк
// записано по одному виду пингвинов. Среди видов встречаются только «Emperor Penguin», «Little Penguin» и
// «Macaroni Penguin»

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        in.nextLine();
        String [] str = new String[n];

        for (int i = 0;i<str.length;i++){
            str[i] = in.nextLine();
        }

        int n1=0;
        int n2 = 0;
        int n3 = 0;
        int max = 0;
        String maxim = null;

        for (int i = 0; i<str.length;i++) {
            if (str[i].equals("Emperor Penguin")) {
                n1++;
            }
            if (str[i].equals("Macaroni Penguin")) {
                n2++;
            }
            if (str[i].equals("Little Penguin")) {
                n3++;
            }
        }

        if (n1>n2){
            max = n1;
            maxim = "Emperor Penguin";
        }
        else {
            max = n2;
            maxim = "Macaroni Penguin";
        }

        if (max<n3){
            max = n3;
            maxim = "Little Penguin";
        }

        out.println(maxim);
        out.flush();
        }

    }

