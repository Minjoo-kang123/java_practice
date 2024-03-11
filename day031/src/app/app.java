package app;

import company.Employee;
import company.SalesEmployee;
import company.SecretaryEmployee;

public class app {

    public static void main(String[] args) {
        Employee e1 = new Employee("100", "jamse", "Account", 2000);
        System.out.println(e1);
        SalesEmployee e2 = new SalesEmployee("100", "jamse", "Account", 2000, 2000);
        System.out.println(e2);
        SecretaryEmployee e3 = new SecretaryEmployee("100", "jamse", "Account", 2000, "Kim");
        System.out.println(e3);

        Object obj = new Employee("100", "jamse", "Account", 2000);
        System.out.println(obj);

        Employee[] emp = new Employee[3];
        emp[0] = new Employee("100", "jamse", "Account", 2000);
        emp[1] = new SalesEmployee("100", "jamse", "Account", 2000, 2000);
        emp[2] = new SecretaryEmployee("100", "jamse", "Account", 2000, "Kim");

        for (Employee e : emp){
            System.out.println(e.toString());
        }
    }
}
