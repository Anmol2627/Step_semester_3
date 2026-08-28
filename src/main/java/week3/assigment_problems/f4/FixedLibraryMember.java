package week3.assigment_problems.f4;

public class FixedLibraryMember {
    // Instance fields
    String name;
    String memberId;
    int booksIssued;

    // Static fields
    static String libraryName = "Central Library";
    static int memberCount = 0;

    public FixedLibraryMember(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
        
        memberCount++;
        this.memberId = "LM-100" + memberCount;
    }

    public void printMemberCard() {
        System.out.println(this.name + " | " + this.memberId);
    }

    public static void printTotalMembers() {
        System.out.println("Total members: " + memberCount);
    }
}
