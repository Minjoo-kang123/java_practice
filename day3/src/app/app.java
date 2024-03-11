package app;

import company.Employee;

public class app {
    public static void main(String[] args) {
        Employee e1 = new Employee("10000", "hello1", 100000L);
        Employee e2 = new Employee("20000", "hello2", 100000L);
        Employee e3 = new Employee("30000", "hello3", 100000L);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
