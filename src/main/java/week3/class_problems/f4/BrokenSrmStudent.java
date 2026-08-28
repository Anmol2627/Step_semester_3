package week3.class_problems.f4;

public class BrokenSrmStudent {
    // WRONG: Marking name static means all instances share the same name. 
    // Creating a new student overwrites the name for all students.
    static String name;

    // WRONG: regNo is unique per student. Making it static means only one regNo 
    // exists across the entire class, overwriting previous ones.
    static String regNo;

    // WRONG: attendance is specific to a student. Making it static means every 
    // student shares the exact same attendance record.
    static int attendance;

    public BrokenSrmStudent(String name, String regNo, int attendance) {
        BrokenSrmStudent.name = name;
        BrokenSrmStudent.regNo = regNo;
        BrokenSrmStudent.attendance = attendance;
    }
}
