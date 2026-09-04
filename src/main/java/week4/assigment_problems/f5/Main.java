package week4.assigment_problems.f5;

public class Main {
    public static void main(String[] args) {
        DeliveryAccount[] accounts = {
            new Premium("STU001", 500),
            null,
            new DeliveryAccount("STU002", 300)
        };
        double[] amounts = {500, 400, 300};
        int[] delays = {10, 5, 0};

        ReconciliationEngine.processBatch(accounts, amounts, delays);
    }
}
