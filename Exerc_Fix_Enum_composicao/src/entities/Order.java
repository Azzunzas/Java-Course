package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
    private Date moment;
    private OrderStatus status;

    private Client client;

    private static final List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem orderItem){
        items.add(orderItem);
    }
    public void removeItem(OrderItem orderItem){
        items.remove(orderItem);
    }

    public double total(){
        double totalvalue = 0;
        for (OrderItem c: items){
            int i = c.getQuantity();
            double j = c.getPrice();
            totalvalue += i * j;
        }
        return totalvalue;
    }

    @Override
    public String toString() {
        return  "Ordem moment: " + sdf.format(moment) + "\n" +
                "Ordem status: " + status + "\n" +
                "client: " + client + "\n" +
                "Ordem items: \n" +
                items + "\n" +
                "Total price: $" + total();
    }
}
