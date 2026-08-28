package week3.class_problems.f3;

public class Main {
    public static void main(String[] args) {
        HostelRoom r1 = new HostelRoom("C-214", 3, 2);
        HostelRoom r2 = new HostelRoom("C-507", 2, 2);
        HostelRoom[] roomsWithSpace = { r1, r2 };

        System.out.println("Rooms: C-214 (2/3), C-507 (2/2)");
        HostelRoom.safeAllot(roomsWithSpace, "Divya");

        HostelRoom r3 = new HostelRoom("C-214", 3, 3);
        HostelRoom r4 = new HostelRoom("C-507", 2, 2);
        HostelRoom[] fullRooms = { r3, r4 };

        System.out.println("Rooms: C-214 (3/3), C-507 (2/2)");
        HostelRoom.safeAllot(fullRooms, "Divya");
    }
}
