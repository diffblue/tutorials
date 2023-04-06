package strings;

public class Employee {
    private String name;
    private String department;
    private int A;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, int A) {
        this.name = name;
        this.A = A;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}