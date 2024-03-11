package account;

public class Account {
    static long accNum = 100;
    private String accountNumber;
    private String regDate;
    private long userid;
    private long balance;
    private int code;
    private double interestRate;
    private boolean isAlive;

    public Account() {
    }

    public Account(String regDate, long userid, long balance, int code, double interestRate) {
        this.accountNumber = String.valueOf(accNum++);
        this.regDate = regDate;
        this.userid = userid;
        this.balance = balance;
        this.code = code;
        this.interestRate = interestRate;
        this.isAlive = true;
    }

    protected void setBalance(long money){
        this.balance = money;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getRegDate() {
        return regDate;
    }

    public long getUserid() {
        return userid;
    }

    public long getBalance() {
        return balance;
    }

    public int getCode() {
        return code;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(long amount){
        this.balance += amount;
    }
    public void withdraw(long amount){
        if(this.balance <= amount)
            return;
        this.balance -= amount;
    }
    public void terminate(){
        this.balance = 0;
        this.isAlive = false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", regDate='" + regDate + '\'' +
                ", userid=" + userid +
                ", balance=" + balance +
                ", code=" + code +
                ", interestRate=" + interestRate +
                ", isAlive=" + isAlive +
                '}';
    }

}
