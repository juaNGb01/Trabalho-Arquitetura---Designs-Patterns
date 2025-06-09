package org.example;

import org.example.entities.User;
import org.example.implementation.BankAccountImplementation;
import org.example.proxy.BankAccountProxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        User randomUser = new User("Alex", "8922");
        User ownerAccount = new User("Megan", "4002");

        BankAccountProxy proxyInvalidAccount = new BankAccountProxy(new BankAccountImplementation(5000.0), randomUser.getName(),
                randomUser.getPasswd());

        System.out.println("----Proxy usuário Invalido----");
        System.out.println("Valor da conta: $" + proxyInvalidAccount.getBalance());
        System.out.println("Saque na conta: ");
        proxyInvalidAccount.withdraw(375.50);

        System.out.println("----Proxy usuário valido----");
        BankAccountProxy proxyValidAccount = new BankAccountProxy(new BankAccountImplementation(5000.0), ownerAccount.getName(),
                ownerAccount.getPasswd());

        System.out.println("Valor da conta: $" + proxyValidAccount.getBalance());
        System.out.println("Saque na conta: ");
        proxyValidAccount.withdraw(375.50);







    }
}