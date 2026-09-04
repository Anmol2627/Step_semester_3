package week4.assigment_problems.f4;

public class Main {
    public static void main(String[] args) {
        // Floor is 1% based on the explanation
        SurgeFeeCalculator calc = new SurgeFeeCalculator(0.01);
        
        System.out.println("orderValue = 500, delayMinutes = 0 -> Rs " + calc.calculateSurgeFee(500, 0));
        System.out.println("orderValue = 500, delayMinutes = 1 -> Rs " + calc.calculateSurgeFee(500, 1));
        System.out.println("orderValue = 500, delayMinutes = 16 -> Rs " + calc.calculateSurgeFee(500, 16));
    }
}
