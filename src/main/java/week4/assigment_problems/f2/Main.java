package week4.assigment_problems.f2;

public class Main {
    public static void main(String[] args) {
        DeliverySlot d1 = new DeliverySlot("ORD101", "13:00-14:00");
        System.out.println(d1.isPeakHour());

        DeliverySlot d2 = new DeliverySlot("ORD102");
        System.out.println(d2.isPeakHour());
    }
}
