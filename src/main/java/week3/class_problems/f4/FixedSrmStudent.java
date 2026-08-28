package week3.class_problems.f4;

public class FixedSrmStudent {
    // Instance fields: unique to each object
    String name;
    String regNo;
    int attendance;

    // Static fields: shared across all instances
    static String university = "SRM";
    static int admissionCount = 0;

    public FixedSrmStudent(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        
        // Derive regNo automatically
        admissionCount++;
        this.regNo = "RA23110030101" + admissionCount;
    }

    public void printIdCard() {
        System.out.println(this.name + " | " + this.regNo);
    }

    public static void printTotalAdmissions() {
        System.out.println("Students admitted so far: " + admissionCount);
    }
}
