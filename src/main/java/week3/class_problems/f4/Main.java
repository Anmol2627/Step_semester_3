package week3.class_problems.f4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Broken version:");
        BrokenSrmStudent s1 = new BrokenSrmStudent("Ravi", "RA01", 80);
        BrokenSrmStudent s2 = new BrokenSrmStudent("Meera", "RA02", 90);
        
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println("(Ravi's data was overwritten — both students now show \"Meera\")\n");

        System.out.println("Fixed version: same two students created");
        FixedSrmStudent f1 = new FixedSrmStudent("Ravi", 80);
        FixedSrmStudent f2 = new FixedSrmStudent("Meera", 90);
        
        f1.printIdCard();
        f2.printIdCard();
        FixedSrmStudent.printTotalAdmissions();
    }
}
