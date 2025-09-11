import java.util.List;
import java.util.ArrayList;

class Employee {
    private String name;
    private double salary;
    private List < Employee > subordinates;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList <  > ();
    }

    public void addSubordinate(Employee e) {
        subordinates.add(e);
    }

    public double getSalary() {
        return salary;
    }

    public List < Employee > getSubordinates() {
        return subordinates;
    }

    public String getName() {
        return name;
    }
}

class Organization {

    public double calculateTotalSalary(Employee manager) {

        if (manager.getSubordinates().isEmpty()) {
            return manager.getSalary();
        }
        return manager.getSalary() + sumSalariesOfList(manager.getSubordinates());
    }

    //for Subordinates(): if the employee has suSubordinates the
    //if employee doesn't has suSubordinates return 0;
    //else call first employee to calculate the salary then get other employeee
    
	private double sumSalariesOfList(List < Employee > employees) {
        if (employees.isEmpty()) {
            return 0;
        }
        return calculateTotalSalary(employees.get(0)) + sumSalariesOfList(employees.subList(1, employees.size()));
    }

}