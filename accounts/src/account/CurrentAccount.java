package account;

import java.time.LocalDate;

public class CurrentAccount extends Account{
    private long overdraftLimit;
    static private long overdraft = 500000L;

    public CurrentAccount(String regDate, long userid, long balance, int code, double interestRate) {
        super(regDate, userid, balance, code, interestRate);
        this.overdraftLimit = overdraft;
    }

    public CurrentAccount(long overdraftLimit) {
        this.overdraftLimit = overdraft;
    }

    @Override
    public void withdraw(long amount){
        //만료일 후면 출금 가능, 전이면 출금 불가능
        LocalDate today = LocalDate.now();
        if(getBalance() + this.overdraftLimit > amount)
            return;
        setBalance(getBalance() - overdraftLimit);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "overdraftLimit=" + overdraftLimit +
                "} " + super.toString();
    }
}
