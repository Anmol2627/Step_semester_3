package week3.assigment_problems.f3;

public class Main {
    public static void main(String[] args) {
        ParkingSlot s1 = new ParkingSlot("A1", 4, 3);
        ParkingSlot s2 = new ParkingSlot("A2", 5, 5);
        ParkingSlot[] slotsWithSpace = { s1, s2 };

        System.out.println("Slots: A1 (3/4), A2 (5/5)");
        ParkingSlot.safeAllot(slotsWithSpace, "TN09AB1234");

        ParkingSlot s3 = new ParkingSlot("A1", 4, 4);
        ParkingSlot s4 = new ParkingSlot("A2", 5, 5);
        ParkingSlot[] fullSlots = { s3, s4 };

        System.out.println("Slots: A1 (4/4), A2 (5/5)");
        ParkingSlot.safeAllot(fullSlots, "TN09AB1234");
    }
}
