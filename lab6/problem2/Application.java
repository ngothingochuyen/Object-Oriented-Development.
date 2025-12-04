package lab6.problem2;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Huyen", 3000));
        employees.add(new PartTimeEmployee("Tran", 20, 80));

        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.getName());
            System.out.println("Pay: $" + emp.calculatePay());
            System.out.println("-------------------");
        }
    }
}
