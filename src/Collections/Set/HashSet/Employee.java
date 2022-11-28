package Collections.Set.HashSet;

public class Employee {
    int id;
    String employeename;
    int employeesalary;
    @Override
    public String toString() {
        return "{Employee ID : "+id+" Student Name : "+ employeename+" Student Marks : "+employeesalary+'}';
    }

    public Employee(int id, String employeename, int employeesalary) {
        this.id = id;
        this.employeename = employeename;
        this.employeesalary = employeesalary;
    }

    public static void main(String[] args) {

    }
}
