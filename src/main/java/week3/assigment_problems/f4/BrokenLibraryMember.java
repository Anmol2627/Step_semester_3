package week3.assigment_problems.f4;

public class BrokenLibraryMember {
    // WRONG: marking name static makes it a class-level variable. 
    // All members will share the exact same name. Overwriting it changes it for everyone.
    static String name;
    
    // WRONG: memberId should be unique per member. Making it static means only 
    // one memberId exists across the entire class, shared by all instances.
    static String memberId;
    
    // WRONG: booksIssued tracks an individual's books. Making it static means 
    // everyone shares the same count of issued books.
    static int booksIssued;

    public BrokenLibraryMember(String name, String memberId, int booksIssued) {
        BrokenLibraryMember.name = name;
        BrokenLibraryMember.memberId = memberId;
        BrokenLibraryMember.booksIssued = booksIssued;
    }
}
