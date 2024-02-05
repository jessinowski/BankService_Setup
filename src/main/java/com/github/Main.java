package com.github;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Step 1:
        // Create a record 'Client' with the properties First Name, Last Name, and Customer Number
        // (choose suitable English field names).

        Client jessica = new Client("Jessica","Zarnowki", 1804);
        Client hanne = new Client("Hanne","Lore", 1922);

        // Step 6:
        // Implement a method in BankService to open an account.
        BankService haspa = new BankService();


        Account myAccount = new Account(haspa.newAccountNumber(jessica), new BigDecimal(0), jessica);

        System.out.println(myAccount.deposit(new BigDecimal(200)));

    }
}