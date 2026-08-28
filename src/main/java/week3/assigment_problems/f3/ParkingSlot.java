package week3.assigment_problems.f3;

public class ParkingSlot {
    public String slotNo;
    public int capacity;
    public int occupiedCount;

    public ParkingSlot(String slotNo, int capacity, int occupiedCount) {
        this.slotNo = slotNo;
        this.capacity = capacity;
        this.occupiedCount = occupiedCount;
    }

    public void allot(String vehicleNo) {
        if (this.occupiedCount < this.capacity) {
            this.occupiedCount++;
            System.out.println(vehicleNo + " allotted to slot " + this.slotNo);
        }
    }

    public static ParkingSlot findAvailableSlot(ParkingSlot[] slots) {
        for (ParkingSlot slot : slots) {
            if (slot.occupiedCount < slot.capacity) {
                return slot;
            }
        }
        return null;
    }

    // Justification: Passing the ParkingSlot array into these methods passes
    // references to the objects, not copies of the objects themselves. 
    // This allows the methods to modify the exact same ParkingSlot objects 
    // without needing to return updated copies.
    public static void safeAllot(ParkingSlot[] slots, String vehicleNo) {
        ParkingSlot slot = findAvailableSlot(slots);
        if (slot != null) {
            slot.allot(vehicleNo);
        } else {
            System.out.println("No slots available for " + vehicleNo);
        }
    }
}
