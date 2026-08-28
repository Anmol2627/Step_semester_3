package week3.class_problems.f2;

public class ScholarshipFeeAccount extends FeeAccount {
    private double scholarshipPercent;

    public ScholarshipFeeAccount(String regNo, double totalFee, double amountPaid, double scholarshipPercent) {
        super(regNo, totalFee, amountPaid);
        if (scholarshipPercent >= 0 && scholarshipPercent <= 100) {
            this.scholarshipPercent = scholarshipPercent;
        }
    }

    public double effectiveDue() {
        double currentDue = getDue();
        return currentDue - (currentDue * scholarshipPercent / 100.0);
    }
}
