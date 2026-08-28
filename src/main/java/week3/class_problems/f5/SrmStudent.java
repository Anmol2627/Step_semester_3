package week3.class_problems.f5;

import week3.class_problems.f2.HostelFeeAccount;
import week3.class_problems.f3.HostelRoom;

public class SrmStudent {
    String name;
    String regNo;
    HostelFeeAccount feeAccount;
    HostelRoom room;

    static int totalStudents = 0;

    public SrmStudent(String name, String regNo, HostelFeeAccount feeAccount, HostelRoom room) {
        this.name = name;
        this.regNo = regNo;
        this.feeAccount = feeAccount;
        this.room = room;
        totalStudents++;
    }

    public String fullStatus() {
        String roomNumber = (this.room != null) ? this.room.roomNo : "unallotted";
        return this.name + " | Due: Rs " + this.feeAccount.getDue() + " | Room: " + roomNumber;
    }
}
