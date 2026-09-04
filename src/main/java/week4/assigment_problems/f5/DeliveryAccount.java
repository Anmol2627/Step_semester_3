package week4.assigment_problems.f5;

public class DeliveryAccount {
    protected String studentId;
    protected double orderValue;

    // Static block for one-time class-level state
    static {
        System.out.println("Initializing DeliveryAccount System...");
    }

    public DeliveryAccount(String studentId, double orderValue) {
        this.studentId = studentId;
        this.orderValue = orderValue;
    }

    public DeliveryAccount(String studentId) {
        this(studentId, 0.0);
    }

    // Reuse Problem 4's logic
    public final double calculateSurgeFee(int delayMinutes) {
        if (orderValue < 0 || delayMinutes < 0) {
            return 0.0;
        }
        if (delayMinutes == 0) {
            return 0.0;
        }

        double fee = 0.0;
        int tier1Mins = Math.min(delayMinutes, 5);
        fee += tier1Mins * 0.005 * orderValue;
        
        if (delayMinutes > 5) {
            int tier2Mins = Math.min(delayMinutes - 5, 10);
            fee += tier2Mins * 0.01 * orderValue;
        }
        
        if (delayMinutes > 15) {
            int tier3Mins = delayMinutes - 15;
            fee += tier3Mins * 0.02 * orderValue;
        }
        
        double minimumFloor = orderValue * 0.01;
        return Math.max(fee, minimumFloor);
    }
}
