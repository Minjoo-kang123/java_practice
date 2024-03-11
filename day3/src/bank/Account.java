package bank;

public class Account {
    public static  int count = 100000;
    private String accNum;
    private String custName;
    private long balance;
    private double interest;

    static {
        System.out.println("System is start....");
        count = 100000;
        System.out.println("System is end....");
    }

    public Account() {
    }

    public Account(String accNum, String custName, long balance, double interest) {
        this.accNum = String.valueOf(count++);
        this.custName = custName;
        if(balance < 0){
            System.out.println("잔액은 0 이상이 입력되어야합니다.");
            return;
        }
        this.balance = balance;
        this.interest = interest;
        count++;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getCustName() {
        return custName;
    }

    public long getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNum='" + accNum + '\'' +
                ", custName='" + custName + '\'' +
                ", balance=" + balance +
                ", interest=" + interest +
                '}';
    }

    public void withdraw(long money) {
        if(money > this.balance)
            return;
        this.balance -= money;
    }

    public void depoit(long money) {
        if(money <= 0)
            return;
        this.balance += money;
    }

    public double getCalInterest() {
        return (this.balance * this.interest)/100;
    }
    public int getCalInterest(int month) {
        return (int)(this.getCalInterest());
    }
}
