import java.util.Scanner;

public class WasteCollectionStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read waste collected in kilograms
        System.out.print("Enter waste collected (kg): ");
        double wasteCollected = sc.nextDouble();

        // Check the collection status
        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        
    }
}