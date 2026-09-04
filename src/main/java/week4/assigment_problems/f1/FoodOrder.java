package week4.assigment_problems.f1;

public class FoodOrder {
    private String studentName;
    private String dishName;
    private boolean isDelivered;

    public FoodOrder(String studentName, String dishName) {
        if (studentName == null || studentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid student name");
        }
        if (dishName == null || dishName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid dish name");
        }
        this.studentName = studentName.trim();
        this.dishName = dishName.trim();
        this.isDelivered = false;
    }

    public void markDelivered() {
        if (this.isDelivered) {
            System.out.println("Warning: Order for " + studentName + " (" + dishName + ") is already marked as delivered!");
        } else {
            this.isDelivered = true;
            System.out.println("Order for " + studentName + " (" + dishName + ") marked as delivered.");
        }
    }

    public static void processBatch(String[][] rawOrders) {
        int accepted = 0;
        int rejected = 0;
        for (String[] rawOrder : rawOrders) {
            if (rawOrder == null || rawOrder.length != 2) {
                rejected++;
                continue;
            }
            try {
                FoodOrder order = new FoodOrder(rawOrder[0], rawOrder[1]);
                accepted++;
            } catch (IllegalArgumentException e) {
                rejected++;
            }
        }
        System.out.println("Valid: " + accepted + " | Rejected: " + rejected);
    }
}
