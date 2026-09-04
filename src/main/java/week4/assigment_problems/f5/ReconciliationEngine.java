package week4.assigment_problems.f5;

public class ReconciliationEngine {
    
    public void processAccount(DeliveryAccount account, double amount, int delayMinutes) {
        // Just an instance method placeholder if needed
    }

    public static void processBatch(DeliveryAccount[] accounts, double[] amounts, int[] delayMinutesArray) {
        if (accounts.length != amounts.length || accounts.length != delayMinutesArray.length) {
            System.out.println("Error: Input arrays have mismatched lengths. Aborting batch to avoid processing the wrong amount for the wrong student.");
            return;
        }

        int processed = 0;
        int nullSkipped = 0;
        int premiumCount = 0;
        int regularCount = 0;
        double grandTotalSurge = 0.0;

        for (int i = 0; i < accounts.length; i++) {
            DeliveryAccount account = accounts[i];
            if (account == null) {
                nullSkipped++;
                continue;
            }

            processed++;
            double surge = account.calculateSurgeFee(delayMinutesArray[i]);

            if (account instanceof Premium) {
                premiumCount++;
                // Premium members get surge fees settled differently: let's say they pay half surge fee.
                surge = surge * 0.5;
            } else {
                regularCount++;
            }
            
            grandTotalSurge += surge;
        }

        System.out.println(processed + " processed | " + nullSkipped + " null skipped | " + 
                           premiumCount + " premium | " + regularCount + " regular | grand total surge fees = Rs " + grandTotalSurge);
    }
}
