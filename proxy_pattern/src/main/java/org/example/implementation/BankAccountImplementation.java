package org.example.implementation;

import org.example.BankAccountInterface.BankAccount;

public class BankAccountImplementation implements BankAccount {

    private Double salaryBalance;

    public BankAccountImplementation(Double salary) {
        this.salaryBalance = salary;
    }

    @Override
    public Double getBalance() {
        return salaryBalance;
    }

    @Override
    public void withdraw(double amount) {

        if(amount <= salaryBalance){
            salaryBalance = salaryBalance - amount;
            System.out.println("Retirada confirmada, saldo atual:" + getBalance());
        }else{
            System.out.println("Saldo insuficiente!");
        }

    }
}
