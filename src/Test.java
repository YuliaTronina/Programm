import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[][] matrix1 = new int[5][6];
        int [][]matrix2 = new int[4][5];
        int a = 2, b=3;
        Random random = new Random();

        for (int i=0; i<5;i++){
            for(int j=0; j<6;j++){
                matrix1[i][j]= random.nextInt(10);
            }
        }

        System.out.println();

        for (int i=0; i<5;i++){
            for (int j = 0; j<6; j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<4;i++) {
            if (i >= a) {
                matrix1[i] = matrix1[i+1];
            }
            for (int j = 0; j < 5; j++) {
                if (j >= b) {
                    matrix1 [i][j]=matrix1[i][j+1];
                }
                    matrix2[i][j] = matrix1[i][j];
                }
            }

            for (int i =0; i<4;i++){
                for (int j=0; j<5;j++){
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

