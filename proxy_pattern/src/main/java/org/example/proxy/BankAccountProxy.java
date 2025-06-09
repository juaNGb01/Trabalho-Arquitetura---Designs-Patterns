package org.example.proxy;

import org.example.BankAccountInterface.BankAccount;
import org.example.implementation.BankAccountImplementation;

public class BankAccountProxy implements BankAccount {

    private BankAccount backAccount;
    private String userName;
    private String passwd;

    public BankAccountProxy(BankAccount backAccount, String userName, String passwd) {
        this.backAccount = backAccount;
        this.userName = userName;
        this.passwd = passwd;
    }

    public BankAccount getBackAccount() {
        return backAccount;
    }

    public void setBackAccount(BankAccountImplementation backAccount) {
        this.backAccount = backAccount;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public Double getBalance() {
        return  backAccount.getBalance();
    }

    @Override
    public void withdraw(double amount) {
        if(userName.equals("Megan") && passwd.equals("4002")){
            backAccount.withdraw(amount);
        }else{
            System.out.println("Usuário " + userName + " não tem acesso a essa operação");
        }

    }
}
