package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
    Employee emp = new Employee(100, "id01", "홍길동", 10000000L);
    long sal = emp.getSal();
    long annsal = emp.getAnnSalary();
    System.out.println(annsal);
    }
}
