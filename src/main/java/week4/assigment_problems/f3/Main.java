package week4.assigment_problems.f3;

public class Main {
    public static void main(String[] args) {
        Canteen[] canteens = {
            new Canteen("HB3-C", "Spice Junction", 3),
            new Canteen("hb1-c", "Grand Mess", 5),
            new Canteen("HB2-C", "Southern Treats")
        };
        
        Canteen[] ranked = Canteen.rankCanteens(canteens);
        
        System.out.print("[");
        for (int i = 0; i < ranked.length; i++) {
            System.out.print("\"" + ranked[i].getCanteenCode() + "\"");
            if (i < ranked.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
