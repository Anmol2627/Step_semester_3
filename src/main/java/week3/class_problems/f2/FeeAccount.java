package week3.class_problems.f2;

public class FeeAccount {
    private String regNo;
    private double totalFee;
    private double amountPaid;

    public FeeAccount(String regNo, double totalFee, double amountPaid) {
        this.regNo = regNo;
        this.totalFee = totalFee;
        this.amountPaid = amountPaid;
    }

    public void pay(double amount) {
        if (amount > 0) {
            this.amountPaid += amount;
        } else {
            System.out.println("Payment must be positive.");
        }
    }

    public double getDue() {
        return this.totalFee - this.amountPaid;
    }

    public String getRegNo() {
        return this.regNo;
    }
}
