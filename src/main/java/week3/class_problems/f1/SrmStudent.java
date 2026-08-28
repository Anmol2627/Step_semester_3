package week3.class_problems.f1;

public class SrmStudent {
    String name;
    String regNo;
    int attendance;

    public SrmStudent(String name, String regNo, int attendance) {
        this.name = name;
        this.regNo = regNo;
        this.attendance = attendance;
    }

    public void addAttendanceUpdate(int newAttendance) {
        this.attendance = newAttendance;
    }

    public boolean isEligible() {
        return this.attendance >= 75;
    }

    // Justification: classAverage operates on a collection of students,
    // it computes a metric for the class as a whole. Thus, it's a static utility method.
    // isEligible operates on the specific data of a single student instance.
    public static double classAverage(SrmStudent[] students) {
        if (students.length == 0) return 0.0;
        int total = 0;
        for (SrmStudent s : students) {
            total += s.attendance;
        }
        return (double) total / students.length;
    }

    public static void main(String[] args) {
        SrmStudent[] students = new SrmStudent[5];
        students[0] = new SrmStudent("Ravi", "RA01", 82);
        students[1] = new SrmStudent("Anitha", "RA02", 68);
        students[2] = new SrmStudent("Karthik", "RA03", 91);
        students[3] = new SrmStudent("Meera", "RA04", 74);
        students[4] = new SrmStudent("Suresh", "RA05", 60);

        System.out.println("5 students:");
        for (SrmStudent s : students) {
            String status = s.isEligible() ? "Eligible" : "Detained";
            System.out.println(s.name + " - " + s.attendance + "% - " + status);
        }
        System.out.println("Class average: " + SrmStudent.classAverage(students) + "%");
    }
}
