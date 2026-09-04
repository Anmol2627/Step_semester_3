package week4.assigment_problems.f3;

public class Canteen {
    private String canteenCode;
    private String canteenName;
    private int trustScore;

    public Canteen(String canteenCode, String canteenName, int trustScore) {
        this.canteenCode = canteenCode;
        this.canteenName = canteenName;
        this.trustScore = trustScore;
    }

    public Canteen(String canteenCode, String canteenName) {
        this(canteenCode, canteenName, 3);
    }

    public int compareTo(Canteen other) {
        // Tie-breaking order: score (descending), then code (case-insensitive ascending), then name length (ascending)
        if (this.trustScore != other.trustScore) {
            return Integer.compare(other.trustScore, this.trustScore);
        }
        
        int codeComparison = this.canteenCode.compareToIgnoreCase(other.canteenCode);
        if (codeComparison != 0) {
            return codeComparison;
        }
        
        return Integer.compare(this.canteenName.length(), other.canteenName.length());
    }

    public static Canteen[] rankCanteens(Canteen[] canteens) {
        // Implement ranking sort yourself; do not call built-in sort utility
        Canteen[] sorted = new Canteen[canteens.length];
        System.arraycopy(canteens, 0, sorted, 0, canteens.length);
        
        // Simple bubble sort is fine for O(n^2) requirement
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j].compareTo(sorted[j + 1]) > 0) {
                    Canteen temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }

    public String getCanteenCode() {
        return canteenCode;
    }
}
