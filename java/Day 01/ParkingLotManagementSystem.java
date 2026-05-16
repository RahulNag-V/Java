import java.util.Scanner;

public class ParkingLotManagementSystem {

    int totalSlots = 5;
    int occupiedSlots = 0;
    int parkingFee = 0;

    Scanner input = new Scanner(System.in);

    boolean running = true;

    void parkVehicle() {

        System.out.println("\n1. VIP Vehicle");
        System.out.println("2. Regular Vehicle");

        System.out.print("Enter Vehicle Type: ");
        int choice = input.nextInt();

        if (choice == 1) {

            System.out.print("Enter VIP Code: ");
            String vipCode = input.next();

            if (vipCode.equals("1234")) {

                if (occupiedSlots < totalSlots || occupiedSlots > totalSlots) {
                    occupiedSlots++;
                    parkingFee += 50;
                    System.out.println("Vehicle Parked Successfully");
                } else {
                    System.out.println("Parking Lot Full");
                }

            } else {
                System.out.println("VIP Code Invalid");
            }

        } else if (choice == 2) {

            double occupied = ((double) occupiedSlots / totalSlots) * 100;

            if (occupiedSlots < totalSlots) {

                if (occupied >= 80) {
                    System.out.println("Parking Almost Full, Last Slot Available");
                } else {
                    System.out.println("2 or 3 Slots May Be Available");
                }

                occupiedSlots++;
                parkingFee += 50;
                System.out.println("Vehicle Parked Successfully");

            } else {
                System.out.println("Parking Lot Full");
            }

        } else {
            System.out.println("Invalid Choice");
        }
    }

    void removeVehicle() {

        if (occupiedSlots > 0) {
            occupiedSlots--;
            System.out.println("Vehicle Removed Successfully");
        } else {
            System.out.println("Parking Empty");
        }
    }

    void viewParkingStatus() {

        System.out.println("\n===== PARKING STATUS =====");
        System.out.println("Total Slots     : " + totalSlots);
        System.out.println("Occupied Slots  : " + occupiedSlots);
        System.out.println("Available Slots : " + (totalSlots - occupiedSlots));
        System.out.println("Total Revenue: " + parkingFee);
    }

    void exit() {
        running = false;
        System.out.println("Thank You");
    }

    public static void main(String[] args) {

        ParkingLotManagementSystem parking = new ParkingLotManagementSystem();

        while (parking.running) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. View Parking Status");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = parking.input.nextInt();

            if (choice == 1) {
                parking.parkVehicle();

            } else if (choice == 2) {
                parking.removeVehicle();

            } else if (choice == 3) {
                parking.viewParkingStatus();

            } else if (choice == 4) {
                parking.exit();

            } else {
                System.out.println("Invalid Choice");
            }
        }

        parking.input.close();
    }
}
