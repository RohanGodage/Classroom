package Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEmployee {



    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();
        Employee employee1= new Employee(91,"pqr",67000);
        Employee employee2 = new Employee(30,"abc",47000);
        Employee employee3 = new Employee(11,"jkl",68000);
        Employee employee4 = new Employee(51,"mno",77000);
        Employee employee5 = new Employee(41,"xyz",57000);
        Employee employee6 = new Employee(51,"fgh",17000);
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        employeeSet.add(employee6);
        System.out.println(employeeSet);
    }}
