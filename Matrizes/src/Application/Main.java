package Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        MATRIZ
        System.out.print("tamanho da matriz? ");
        int n = sc.nextInt();
        int [][] mat = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println("digite o elemento da matriz");
                mat[i][j] = sc.nextInt();
            }
        }
//        COMO MOSTRAR A DIAGONAL PRINCIPAL
        System.out.println("main diagonal");
        for (int i = 0; i < n; i++){
            System.out.print(mat[i][i] + " ");
        }
//      MOSTRAR NUMEROS NEGATIVOS
        int count = 0;
        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j]<0){
                    count++;
                }
            }
        }
        System.out.println("negative numbers: " + count);


        sc.close();
    }
}