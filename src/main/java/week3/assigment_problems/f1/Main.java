package week3.assigment_problems.f1;

public class Main {
    public static void main(String[] args) {
        BookIssue[] issues = new BookIssue[5];
        issues[0] = new BookIssue("Clean Code", "Alice", 18);
        issues[1] = new BookIssue("Effective Java", "Bob", 5);
        issues[2] = new BookIssue("Refactoring", "Charlie", 0);
        issues[3] = new BookIssue("DSA Handbook", "David", 21);
        issues[4] = new BookIssue("Design Patterns", "Eve", 9);

        System.out.println("5 books, daysOverdue:");
        for (BookIssue issue : issues) {
            String status = issue.isSeverelyOverdue() ? "Severely overdue" : "OK";
            System.out.println(issue.title + " - " + issue.daysOverdue + " days - " + status);
        }
        
        System.out.println("Total fine collected: Rs " + BookIssue.totalFineCollected(issues));
    }
}
