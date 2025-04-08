import entities.ImportedProduct;
import entities.Product;
import entities.UserProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for( int i = 0; i < n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, usedorimported(c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("price: ");
            sc.nextLine();
            double price = sc.nextDouble();
            if(ch == 'i'){
                System.out.print(" Customsfee: ");
                double custemFee = sc.nextDouble();
                Product prod = new ImportedProduct(name,price,custemFee);
                list.add(prod);
            } else if (ch == 'u') {
                System.out.print(" Manufacturedate (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product prod = new UserProduct(name,price,date);
                list.add(prod);
            } else if (ch == 'c') {
                Product prod = new Product(name,price);
                list.add(prod);
            }
        }
        System.out.println("PRICE TAGS:");
        for(Product prod : list){
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}