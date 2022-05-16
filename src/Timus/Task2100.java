package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(); //Количество гостей на свадьбе
        int quantity = 2 +n;  // количество гостей+жених+невеста, без учета "+один"
        String [] Guests = new String[n];

        for (int i=0;i<n; i++){
            Guests[i] = in.next();  //заводятся данные гостя
            if(Guests[i].contains("+")){ //если в данных гостя обнаруживается знак "+", то количество гостей увеличивается на 1.
                quantity++;
            }
        }

        if(quantity==13){     // тест на 13 гостей, если гостей 13, то садят манекен.
            quantity=14;
        }

        int sum = 100*quantity; //вывод стоимости банкета

        out.println(sum);
        out.flush();
    }
}
