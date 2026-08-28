package week3.class_problems.f2;

public class Main {
    public static void main(String[] args) {
        FeeAccount plain = new FeeAccount("R01", 150000, 150000);
        HostelFeeAccount hostel = new HostelFeeAccount("R02", 200000, 60000);
        ScholarshipFeeAccount scholarship = new ScholarshipFeeAccount("R03", 180000, 0, 20);

        FeeAccount[] accounts = { plain, hostel, scholarship };
        
        for (FeeAccount acc : accounts) {
            if (acc instanceof ScholarshipFeeAccount) {
                ScholarshipFeeAccount sa = (ScholarshipFeeAccount) acc;
                System.out.println("Scholarship account effective due: Rs " + sa.effectiveDue());
            } else if (acc instanceof HostelFeeAccount) {
                HostelFeeAccount ha = (HostelFeeAccount) acc;
                System.out.println("Hostel account due: Rs " + ha.getDue());
            } else {
                System.out.println("Plain account due: Rs " + acc.getDue());
            }
        }
    }
}
