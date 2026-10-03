import java.util.Scanner;

public class WasteCollectionVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Vehicle Number: ");
        int vehicleNumber = sc.nextInt();

        System.out.print("Enter Waste Collected (kg): ");
        double wasteCollected = sc.nextDouble();

        System.out.print("Enter Number of Collection Points: ");
        int collectionPoints = sc.nextInt();

        System.out.print("Enter Vehicle Status (A/I): ");
        char vehicleStatus = sc.next().charAt(0);

        // Displaying details
        System.out.println("\n--- Waste Collection Vehicle Details ---");
        System.out.println("Vehicle Number          : " + vehicleNumber);
        System.out.println("Waste Collected (kg)    : " + wasteCollected);
        System.out.println("Collection Points       : " + collectionPoints);
        System.out.println("Vehicle Status          : " + vehicleStatus);

        
    }
}