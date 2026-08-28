package week3.assigment_problems.f5;

import week3.assigment_problems.f2.Employee;
import week3.assigment_problems.f2.ManagerEmployee;
import week3.assigment_problems.f3.ParkingSlot;

public class CompanyEmployeeRecord {
    String name;
    String empId;
    Employee employee;
    ParkingSlot slot;

    static int totalRecords = 0;

    public CompanyEmployeeRecord(String name, String empId, Employee employee, ParkingSlot slot) {
        this.name = name;
        this.empId = empId;
        this.employee = employee;
        this.slot = slot;
        totalRecords++;
    }

    public String fullProfile() {
        double pay = 0;
        if (this.employee instanceof ManagerEmployee) {
            pay = ((ManagerEmployee) this.employee).effectiveSalary();
        } else {
            pay = this.employee.getSalary();
        }
        
        String slotDisplay = (this.slot != null) ? this.slot.slotNo : "no parking assigned";
        return this.name + " | Pay: Rs " + pay + " | Slot: " + slotDisplay;
    }

    public String getEmpId() {
        return this.empId;
    }
}
