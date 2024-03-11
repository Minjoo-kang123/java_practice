package company;

public class SalesEmployee extends Employee{

    private long bonus;

    public SalesEmployee(String id, String name, String dept, long salary, long bonus) {
        super(id, name, dept, salary);
        this.bonus = bonus;
    }

    public SalesEmployee() {
    }

    public long getBonus() {
        return bonus;
    }

    @Override
    public long getAnnSalary() {
        return super.getAnnSalary() + this.bonus;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }
}
