package Bankapp;

import bank.Account;

public class Bankapp {
    public static void main(String[] args) {
        //System.out.println(Account.count);
        Account acc1 = new Account("", "Jamse", 10000L, 2.3);
        Account acc2 = new Account("", "Jamse01", 10000L, 2.3);
        Account acc3 = new Account("", "Jamse02", 10000L, 2.3);
        Account acc4 = new Account("", "Jamse03", 10000L, 2.3);
        System.out.println(acc1.getCalInterest());
        System.out.println(acc1);
    }
}
