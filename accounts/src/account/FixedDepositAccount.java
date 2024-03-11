package account;

import java.time.LocalDate;
public class FixedDepositAccount extends Account{
    private LocalDate maturityDate;
    private int maturityPeriod;

    public FixedDepositAccount(String regDate, long userid, long balance, int code, double interestRate, LocalDate maturityDate, int maturityPeriod) {
        super(regDate, userid, balance, code, interestRate);
        this.maturityDate = maturityDate;
        this.maturityPeriod = maturityPeriod;
    }

    private void addInterest() {
        setBalance((long)((getBalance() * getInterestRate())/100 / 12 * this.maturityPeriod));
    }


    @Override
    public void withdraw(long amount){
        //만료일 후면 출금 가능, 전이면 출금 불가능
        LocalDate today = LocalDate.now();
        if(today.isAfter(maturityDate)) { //출금가능
            super.withdraw(amount);
        } else {
            throw new RuntimeException("만료일 전이므로 출금 불가능합니다.");
        }
    }

    @Override
    public String toString() {
        return "FixedDepositAccount{" +
                "maturityDate=" + maturityDate +
                ", maturityPeriod=" + maturityPeriod +
                "} " + super.toString();
    }
}
