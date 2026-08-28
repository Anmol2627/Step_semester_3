package week3.assigment_problems.f2;

public class InternEmployee extends Employee {
    private double stipendCap;

    public InternEmployee(String empId, String empName, double salary, double stipendCap) {
        super(empId, empName, salary);
        this.stipendCap = stipendCap;
    }

    public double effectiveSalary() {
        double baseSalary = getSalary();
        return baseSalary < stipendCap ? baseSalary : stipendCap;
    }
}
