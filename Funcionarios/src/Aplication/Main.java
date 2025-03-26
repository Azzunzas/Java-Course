package Aplication;

import Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Digite o nome do funcionario");
        employee.name = sc.nextLine();
        System.out.println("Digite o salario bruto do funcionario "+ employee.name);
        employee.grossSalary = sc.nextDouble();
        System.out.println("qual é a taxa de imposto? ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.println("digite a porcentagem de aumento de salario: ");
        employee.IncreaseSalary(sc.nextDouble());

        System.out.println(employee.toString2());

        sc.close();
    }
}