package app;

import account.Account;
import account.CurrentAccount;
import account.SavingsAccount;
import account.FixedDepositAccount;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Account acc1 = new Account("20220102", 21514L, 50000L, 201, 2.1);
        CurrentAccount acc2 = new CurrentAccount("20220102", 21514L, 50000L, 201, 2.1);
        SavingsAccount acc3 = new SavingsAccount("20220102", 21514L, 50000L, 201, 2.1, today.toString(), "25", 2500000L, 6);
        FixedDepositAccount acc4 = new FixedDepositAccount("20220102", 21514L, 50000L, 201, 2.1, today, 6);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);
    }
}
