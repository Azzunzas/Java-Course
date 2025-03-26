package Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite o tamanho da matriz (x _ y): ");
        int tam1 = sc.nextInt();
        int tam2 = sc.nextInt();

        int [][] mat = new int[tam1][tam2];

        for(int i = 0; i < tam1; i++){
            for (int j = 0; j < tam2; j++){
                System.out.printf("Digite o valor da matriz na posicao ["+i+"]["+j+"] :");
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < tam1; i++){
            for (int j = 0; j < tam2; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("digite um numero para procurar na matriz: ");
        int num = sc.nextInt();

        for (int i = 0; i<tam1; i++){
            for (int j = 0; j < tam2; j++){
                if (mat[i][j] == num){
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }






        sc.close();
    }
}