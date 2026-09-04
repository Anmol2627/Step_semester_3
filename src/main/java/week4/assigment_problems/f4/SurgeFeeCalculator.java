package week4.assigment_problems.f4;

public class SurgeFeeCalculator {
    private final double minimumSurgePercent;

    public SurgeFeeCalculator(double minimumSurgePercent) {
        this.minimumSurgePercent = minimumSurgePercent;
    }

    public final double calculateSurgeFee(double orderValue, int delayMinutes) {
        if (orderValue < 0 || delayMinutes < 0) {
            throw new IllegalArgumentException("Negative values not allowed");
        }
        if (delayMinutes == 0) {
            return 0.0;
        }

        double fee = 0.0;
        
        // 1-5 mins: 0.5% per min
        int tier1Mins = Math.min(delayMinutes, 5);
        fee += tier1Mins * 0.005 * orderValue;
        
        // 6-15 mins: 1% per min
        if (delayMinutes > 5) {
            int tier2Mins = Math.min(delayMinutes - 5, 10);
            fee += tier2Mins * 0.01 * orderValue;
        }
        
        // 16+ mins: 2% per min
        if (delayMinutes > 15) {
            int tier3Mins = delayMinutes - 15;
            fee += tier3Mins * 0.02 * orderValue;
        }
        
        double minimumFloor = orderValue * minimumSurgePercent;
        return Math.max(fee, minimumFloor);
    }
}
