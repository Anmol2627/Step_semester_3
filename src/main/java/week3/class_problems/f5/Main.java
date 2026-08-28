package week3.class_problems.f5;

import week3.class_problems.f2.HostelFeeAccount;
import week3.class_problems.f3.HostelRoom;

public class Main {
    public static void main(String[] args) {
        HostelRoom r1 = new HostelRoom("C-214", 3, 0);
        HostelRoom r2 = new HostelRoom("C-507", 2, 0);

        HostelFeeAccount f1 = new HostelFeeAccount("RA01", 200000, 60000);
        HostelFeeAccount f2 = new HostelFeeAccount("RA02", 180000, 0);
        HostelFeeAccount f3 = new HostelFeeAccount("RA03", 200000, 0);

        SrmStudent s1 = new SrmStudent("Ravi", "RA01", f1, r1);
        SrmStudent s2 = new SrmStudent("Anitha", "RA02", f2, r2);
        SrmStudent s3 = new SrmStudent("Karthik", "RA03", f3, null);

        // process a mix of valid and rejected payments
        s3.feeAccount.pay(-5000); // rejected payment

        System.out.println("3 students; rooms allotted to 2 of them;\none payment rejected (negative amount)\n");

        System.out.println(s1.fullStatus());
        System.out.println(s2.fullStatus());
        System.out.println(s3.fullStatus());

        System.out.println("Total students: " + SrmStudent.totalStudents);
    }
}
