package Aplication;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();

        double width;
        double height;

        System.out.println("Enter rectangle width and height: ");
        String entrada = sc.nextLine();

        String[] partes = entrada.split(" ");

        rectangle.width = Double.parseDouble(partes[0]);
        rectangle.height = Double.parseDouble(partes[1]);

        System.out.println(rectangle);

        sc.close();
    }
}