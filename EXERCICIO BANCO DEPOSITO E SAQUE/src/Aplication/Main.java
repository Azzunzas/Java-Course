package Aplication;


import Entities.Account;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double value;
        Account account;
        System.out.println("=======================");
        System.out.println("    BANCO DE JAVA");
        System.out.println("=======================");

        System.out.printf("Enter account number: ");
        int number = sc.nextInt();
        System.out.printf("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        sc.nextLine();// adicionado para limpar buffer
        System.out.printf("Is there na initial deposit (y/n)? ");
        String resp = sc.nextLine();
        if (Objects.equals(resp, "y")){// forma correta de comparacao entre dados
            System.out.println("Enter initial deposit value: ");
            value = sc.nextDouble();
            account = new Account(number,name,value);
        }else{
            account = new Account(number,name);
        }

        System.out.println("Account data: ");
        System.out.println(account.toString());

        System.out.printf("Enter a deposit value: ");
        value = sc.nextDouble();
        account.newDeposit(value);
        System.out.println("Update account data: ");
        System.out.println(account.toString());

        System.out.printf("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.println("Update account data: ");
        System.out.println(account.toString());
    sc.close();
    }
}
