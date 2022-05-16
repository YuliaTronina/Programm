package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1197 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();//Количество тестов
        String[] Test = new String[n]; //Вводим сами значения тестов
        //Массив значений, при которых количество ходов коня отлично от 8. Вначале хотела сделать через 2-мерный массив,
        // где по номеру строки вычислялся бы ответ, но программа работала некорректно
        String[]  Answ = {"a1", "h1", "a8", "h8","a2","b1","a7","b8", "g1", "h2","h7","g8","a3", "a4", "a5", "a6","b2", "b7", "c1", "d1", "e1", "f1","g2", "h3", "h4", "h5", "h6",  "g7",  "c8", "d8", "e8", "f8","b3", "b4", "b5", "b6", "c2", "d2", "e2", "f2","c7", "d7", "e7", "f7", "g3", "g4", "g5", "g6"};

        int[] Ans = new int[n]; //массив для записи количества ходов в каждом тесте

        for (int i = 0; i < n; i++) {
            Test[i] = in.next();     //создаем массим с ходами
        }

        for (int i = 0; i < Test.length; i++) { // сравниваем ход с массивом ходов, отличных от 8, при попадании
                                                // в диапазон значений получем определенный ответ, если ход не найден в
                                                //массиве Answ, то количество ходов = 8.
            for (int j=0;j< Answ.length;j++){
                if(Test[i].equals(Answ[j])){
                    if((j>=0)&(j<4)){
                        Ans[i] = 2;
                        break;
                    }
                    if((j>=4)&(j<12)){
                        Ans[i] = 3;
                        break;
                    }

                    if((j>=12)&(j<32)){
                        Ans[i] = 4;
                        break;
                    }
                    if(j>=32){
                        Ans[i] = 6;
                        break;
                    }
                }
                else {
                    Ans[i] = 8;
                }
                }

        }
 //Вывод массив результатов тестов
            for (int k = 0; k < n; k++) {
                out.println(Ans[k]);
            }
            out.flush();
        }
    }

