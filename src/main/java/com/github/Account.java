package com.github;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    // Step 2:
    // Create a class 'Account' (not a record, should initially be mutable) with the properties
    // Account Number (String), Account Balance (BigDecimal), and the associated customer.
    private String accountNumber;
    private BigDecimal accountBalance;
    private Client client;

    // Step 3:
    // Implement a method to deposit money into the account.
    public BigDecimal deposit(BigDecimal amount){
        return accountBalance.add(amount);
    }

    // Step 4:
    // Implement a method to withdraw money from the account.
    public BigDecimal withdraw(BigDecimal amount){
        return accountBalance.subtract(amount);
    }

    //Konstruktor
    public Account(String accountNumber, BigDecimal accountBalance, Client client) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.client = client;
    }

    //Getter und Setter
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    //Equals und Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(accountBalance, account.accountBalance) && Objects.equals(client, account.client);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountBalance, client);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", client=" + client +
                '}';
    }


}
