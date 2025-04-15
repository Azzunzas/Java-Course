package model.entities;

import model.exceptions.DomainException;

public class Account {

    private Integer numbem;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){
    }

    public Account(Integer numbem, String holder, Double balance, Double withdrawLimit) throws DomainException {
        if (balance < 0){
            throw new RuntimeException("O saldo da conta nao pode ser menor que zero");
        }
        this.numbem = numbem;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumbem() {
        return numbem;
    }

    public void setNumbem(Integer numbem) {
        this.numbem = numbem;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount) throws DomainException {
        if (amount > withdrawLimit){
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if ( amount > balance){
            throw new DomainException("Not enough balance");
        }
        balance -= amount;
    }
}
