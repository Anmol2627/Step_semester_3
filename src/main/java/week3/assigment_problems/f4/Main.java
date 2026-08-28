package week3.assigment_problems.f4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Broken version:");
        BrokenLibraryMember b1 = new BrokenLibraryMember("Aditi", "LM-1001", 2);
        BrokenLibraryMember b2 = new BrokenLibraryMember("Rohan", "LM-1002", 3);
        
        System.out.println(b1.name);
        System.out.println(b2.name);
        System.out.println("(Aditi's data was overwritten — both members now show \"Rohan\")\n");

        System.out.println("Fixed version: same two members created");
        FixedLibraryMember f1 = new FixedLibraryMember("Aditi", 2);
        FixedLibraryMember f2 = new FixedLibraryMember("Rohan", 3);
        
        f1.printMemberCard();
        f2.printMemberCard();
        FixedLibraryMember.printTotalMembers();
    }
}
