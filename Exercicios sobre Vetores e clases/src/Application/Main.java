package Application;

import Entities.Pessoa;
import Entities.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        EXERCICIO "NEGATIVOS"

//        Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

//        System.out.printf("Quantos numeros vc vai digitar? ");
//        int n = sc.nextInt();
//        int[] vect = new int[n];
//
//        for (int i = 0; i < n; i++){
//            System.out.printf("Digite um numero: ");
//            sc.nextLine();
//            vect[i] =sc.nextInt();
//        }
//        System.out.println("numeros negativos: ");
//        for (int i = 0; i < n; i++){
//            if (vect[i] < 0){
//                System.out.println(vect[i]);
//            }
//        }
//

//        EXERCICIO "SOMA VETORES"

//        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//        - Imprimir todos os elementos do vetor
//        - Mostrar na tela a soma e a média dos elementos do vetor

//        System.out.printf("Quantos numeros vc vai digitar? ");
//        int n = sc.nextInt();
//        double[] vect = new double[n];
//        double sum = 0.0;
//
//        for(int i = 0; i < n; i++){
//            System.out.printf("Digite um numero real: ");
//            sc.nextLine();
//            vect[i] = sc.nextDouble();
//        }
//        for (int i = 0; i < n; i++){
//            System.out.println(vect[i]);
//            sum += vect[i];
//
//        }
//        System.out.printf("soma dos numeros do vetor: %.2f%n", + sum);
//        System.out.println(" ");
//        double avg = sum/n;
//        System.out.printf("media dos numeros do vetor: %.2f%n", + avg);

//      EXERCICIO "ALTURAS"
//        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//        bem como os nomes dessas pessoas caso houver.

//        System.out.printf("Quantas pessoas serao digitadas? ");
//        int n = sc.nextInt();
//
//        Pessoa[] pessoas = new Pessoa[n];
//        int cont = 1;
//        for (int i = 0; i < n; i++){
//            System.out.println("Dados da " + cont++ +"a pessoa");
//            System.out.printf("Nome: ");
//            sc.nextLine();
//            String name= sc.nextLine();
//            System.out.printf("Idade: ");
//            int idade = sc.nextInt();
//            System.out.printf("Altura: ");
//            double altura = sc.nextDouble();
//
//            pessoas[i] = new Pessoa(name,idade,altura);
//        }
//        double sum = 0.0;
//        for (int i = 0; i < pessoas.length; i++)
//        {
//            sum += pessoas[i].getAltura();
//        }
//        double media = sum / n;
//        System.out.printf("Altura media das pessoas: %.2f%n", + media);
//
//
//        int quantity = 0;
//        String[] names = new String[n];
//        for (int i = 0; i < pessoas.length; i++){
//            if (pessoas[i].getIdade() < 16){
//                quantity ++;
//                names[i] = pessoas[i].getName();
//            }
//        }
//
//        double porcen = (double) (quantity * 100) /n;
//
//        System.out.printf("Pessoas com menos de 16 anos: " + porcen);


//        ROOMS
        Rooms[] vect = new Rooms[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Rent #" + i + ":");

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] = new Rooms(name,email);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for(int i =0; i<10;i++){
            if(vect[i]!= null){
                System.out.println( i + ":" + vect[i]);
            }
        }
        sc.close();

    }
}