package company;

public class Employee {
    //객체와는 전혀 상관 없는 변수이다. class가 소유함
    private static int num = 100;
    private int id;
    private String idc;
    private String name;
    private Long sal;

    public Employee(int id, String idc, String name) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.sal = 100000L;
    }
    public Employee(int id, String idc, String name, Long sal) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.sal = 100000L;
    }
    public Employee(String idc, String name, Long sal) {
        this(num++, idc, name, sal);
    }
    public Employee(int id) {
        this(id, "","");
        this.sal = 1000000L;
    }

    public Employee(){
        System.out.println("Default Constructor");
        num++;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", idc='" + idc + '\'' +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

}
