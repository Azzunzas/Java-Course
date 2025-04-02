package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date bdate = sdf.parse(sc.next());
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();
        Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name,email,bdate));

        System.out.print("How many items to this order? ");
        int items = sc.nextInt();
        for (int i = 1; i <= items; i++)
        {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String pName = sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quant = sc.nextInt();

            OrderItem orderItem = new OrderItem(quant,price,new Product(pName,price));
            order.addItem(orderItem);
        }
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);


    }
}