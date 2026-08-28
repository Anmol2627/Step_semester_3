package week3.assigment_problems.f1;

public class BookIssue {
    String title;
    String borrowerName;
    int daysOverdue;

    public BookIssue(String title, String borrowerName, int daysOverdue) {
        this.title = title;
        this.borrowerName = borrowerName;
        this.daysOverdue = daysOverdue;
    }

    public double fineAmount() {
        return this.daysOverdue > 0 ? this.daysOverdue * 5 : 0;
    }

    public boolean isSeverelyOverdue() {
        return this.daysOverdue > 14;
    }

    // Justification: totalFineCollected sums fines across multiple BookIssue objects, 
    // hence it acts on a collection of instances rather than on a single book's state. 
    // Therefore, it should be a static method. fineAmount acts on a single book.
    public static double totalFineCollected(BookIssue[] issues) {
        double total = 0;
        for (BookIssue issue : issues) {
            total += issue.fineAmount();
        }
        return total;
    }

    public String getTitle() {
        return this.title;
    }

    public String getBorrowerName() {
        return this.borrowerName;
    }
}
