package Aplication;

import Entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do Aluno");
        aluno.name = sc.nextLine();
        System.out.println("Digite a primeira nota do aluno: "+ aluno.name);
        aluno.nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno: "+ aluno.name);
        aluno.nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota do aluno: "+ aluno.name);
        aluno.nota3 = sc.nextDouble();


        System.out.println(aluno);






      sc.close();
    }
}
