package company;

public class Employee {
    private String id;
    private String name;
    private String dept;
    private long salary;

    public Employee() {
    }

    public Employee(String id, String name, String dept, long salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public long getAnnSalary(){
        return this.salary * 12;
    }

}
