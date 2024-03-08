package company;

public class Employee {
    private int id;
    private String idc;
    private String name;
    private Long sal;

    public Employee(int id, String idc, String name, Long sal) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getIdc() {
        return idc;
    }

    public String getName() {
        return name;
    }

    public Long getSal() {
        return sal;
    }

    public long getAnnSalary(){
        return 24L*getSal();
    }
}
