package week3.assigment_problems.f2;

public class Main {
    public static void main(String[] args) {
        Employee plain = new Employee("E01", "John", 40000);
        ManagerEmployee manager = new ManagerEmployee("M01", "Alice", 70000, 8000);
        InternEmployee intern = new InternEmployee("I01", "Bob", 12000, 10000);

        Employee[] employees = { plain, manager, intern };

        for (Employee emp : employees) {
            if (emp instanceof ManagerEmployee) {
                ManagerEmployee m = (ManagerEmployee) emp;
                System.out.println("Manager effective pay: Rs " + m.effectiveSalary());
            } else if (emp instanceof InternEmployee) {
                InternEmployee i = (InternEmployee) emp;
                System.out.println("Intern effective pay: Rs " + i.effectiveSalary());
            } else {
                System.out.println("Plain employee pay: Rs " + emp.getSalary());
            }
        }
    }
}
