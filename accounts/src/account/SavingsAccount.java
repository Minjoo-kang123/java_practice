package account;

import java.util.Date;

public class SavingsAccount extends Account{
    static String today = "20240311";
    private String terminationDate;
    private String tsavingDate;
    private long tsavingAmounts;
    private int maturityPeriod;

    public SavingsAccount( String regDate, long userid, long balance, int code,
                          double interestRate, String terminationDate, String tsavingDate, long tsavingAmounts, int maturityPeriod) {
        super( regDate, userid, balance, code, interestRate);
        this.terminationDate = terminationDate;
        this.tsavingDate = tsavingDate;
        this.tsavingAmounts = tsavingAmounts;
        this.maturityPeriod = maturityPeriod;
    }

    public int getMaturityPeriod() {
        return maturityPeriod;
    }

    public SavingsAccount(String regDate, long userid, long balance, int code, double interestRate) {
        super(regDate, userid, balance, code, interestRate);
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    public String getTsavingDate() {
        return tsavingDate;
    }

    public long getTsavingAmounts() {
        return tsavingAmounts;
    }

    public void addInterest(){
        setBalance((long)((getBalance() * getInterestRate())/100 / 12 * this.maturityPeriod));
    }
    @Override
    public void withdraw(long amount){
        if(Integer.parseInt(today)  < Integer.parseInt(this.terminationDate))
            return; // 출금불가
        if(this.getBalance() < amount)
            return;
        this.setBalance(getBalance() - amount);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "terminationDate='" + terminationDate + '\'' +
                ", tsavingDate='" + tsavingDate + '\'' +
                ", tsavingAmounts=" + tsavingAmounts +
                ", maturityPeriod=" + maturityPeriod +
                "} " + super.toString();
    }
}
