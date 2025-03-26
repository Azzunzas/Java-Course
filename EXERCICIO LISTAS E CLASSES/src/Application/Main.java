package Application;

import Entities.Emplyoee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List < Emplyoee > emplyoee = new ArrayList<>();

        System.out.println("how many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++)
        {
            System.out.println("Emplyoee #"+i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            emplyoee.add(new Emplyoee(id,name,salary));
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Emplyoee emp = emplyoee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("id nao existente");
        }else{
            System.out.print("enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.incrementSalary(percentage);
        }

        for( Emplyoee x : emplyoee){
            System.out.print("List od employees: ");
            System.out.println(x);
        }
        sc.close();
    }
}