import entities.Company;
import entities.Individual;
import entities.Payer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List< Payer> list = new ArrayList<>();
        double sum = 0;

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++){
            System.out.printf("Tax payer #"+ i +" data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            if (ch == 'i'){
                System.out.print("Name: ");
                String name= sc.next();
                System.out.print("Anual income: ");
                sc.nextLine();
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name,anualIncome,healthExpenditures));

            } else if (ch == 'c') {
                System.out.print("Name: ");
                String name= sc.next();
                System.out.print("Anual income: ");
                sc.nextLine();
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name,anualIncome,numberOfEmployees));

            } else if (ch != 'i' && ch != 'c') {
                System.out.println("erro!!!");
            }
        }
        System.out.println(" TAXES PAID:");
        for (Payer payer: list){
            System.out.print( payer.getName() +": $ "+ String.format("%.2f%n",payer.tax()));
            sum += payer.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ "+ sum);

        sc.close();
    }
}