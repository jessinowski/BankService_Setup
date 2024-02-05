package com.github;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BankService {
    // Step 5:
    // Create a class 'BankService' that manages a set of accounts.
    private Set<Account> accounts = new HashSet<>();

    // Step 6:
    // Implement a method in BankService to open an account.
    // It should only require a customer as an argument and should return the new account number.

    public String newAccountNumber(Client client){
        String newAccountNumber = "22"+client.customerNumber();
        return newAccountNumber;
    }
    // Step 7:
    // Implement a method in BankService to transfer a specific amount (as BigDecimal)
    // from one account number (as String) to another account number (as String).

    // ...in Bearbeitung...

    public BigDecimal transfer(BigDecimal amount, String fromAccountNumber, String toAccountNumber){
        return null;
    }

    //Getter und Setter
    public Set<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankService that = (BankService) o;
        return Objects.equals(accounts, that.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accounts);
    }

    @Override
    public String toString() {
        return "BankService{" +
                "accounts=" + accounts +
                '}';
    }




}
