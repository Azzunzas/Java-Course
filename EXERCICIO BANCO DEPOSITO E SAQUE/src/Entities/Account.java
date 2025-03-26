package Entities;

public class Account {
    private int number;
    private String name;
    private double deposit;
//construtores


    public Account(int number, String name, double deposit) {
        this.number = number;
        this.name = name;
        newDeposit(deposit);
    }
    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }
//metodos get e set
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }



    public void newDeposit(double value){
        deposit += value;
    }

    public void withdraw(double value){
        deposit -= value + 5;
    }


    @Override
    public String toString() {
        return "Account " + number +
                ", Holder: " + name +
                ", Balance: $ " + deposit;
    }
}