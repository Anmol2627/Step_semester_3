package week3.class_problems.f3;

public class HostelRoom {
    public String roomNo;
    public int beds;
    public int occupied;

    public HostelRoom(String roomNo, int beds, int occupied) {
        this.roomNo = roomNo;
        this.beds = beds;
        this.occupied = occupied;
    }

    public void allot(String name) {
        if (this.occupied < this.beds) {
            this.occupied++;
            System.out.println(name + " allotted to room " + this.roomNo);
        }
    }

    public static HostelRoom findAvailableRoom(HostelRoom[] rooms) {
        for (HostelRoom room : rooms) {
            if (room.occupied < room.beds) {
                return room;
            }
        }
        return null;
    }

    // Justification: Passing the HostelRoom array does not copy the rooms themselves
    // because Java passes object references by value. The array contains references
    // to the actual HostelRoom objects in memory, so any modifications to the objects
    // via these references affect the original objects.
    public static void safeAllot(HostelRoom[] rooms, String studentName) {
        HostelRoom availableRoom = findAvailableRoom(rooms);
        if (availableRoom != null) {
            availableRoom.allot(studentName);
        } else {
            System.out.println("No rooms available for " + studentName);
        }
    }
}
