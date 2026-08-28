package week3.assigment_problems.f5;

import week3.assigment_problems.f2.Employee;
import week3.assigment_problems.f2.ManagerEmployee;
import week3.assigment_problems.f3.ParkingSlot;

public class Main {
    public static void main(String[] args) {
        ParkingSlot p1 = new ParkingSlot("A1", 1, 0);
        ParkingSlot p2 = new ParkingSlot("A2", 1, 0);
        
        ManagerEmployee m1 = new ManagerEmployee("M01", "Divya", 70000, 8000);
        Employee e1 = new Employee("E01", "Karan", 40000);
        Employee e2 = new Employee("E02", "Meera", 10000);

        CompanyEmployeeRecord r1 = new CompanyEmployeeRecord("Divya", "M01", m1, p1);
        CompanyEmployeeRecord r2 = new CompanyEmployeeRecord("Karan", "E01", e1, p2);
        CompanyEmployeeRecord r3 = new CompanyEmployeeRecord("Meera", "E02", e2, null);

        System.out.println("3 records; parking allotted to 2 of them\n");
        
        System.out.println(r1.fullProfile());
        System.out.println(r2.fullProfile());
        System.out.println(r3.fullProfile());
        
        System.out.println("Total records: " + CompanyEmployeeRecord.totalRecords);
    }
}
