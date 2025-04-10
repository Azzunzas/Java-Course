package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UserProduct extends Product {
    private LocalDate manufactureDate;

    public UserProduct() {
    }

    public UserProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() +
                "(User) $ " +
                String.format("%.2f",getPrice()) +
                "(Manufacture date: " +
                manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ")";
    }
}
