import java.util.Scanner;

public class SmartWaterTankSystem {

    Scanner input = new Scanner(System.in);

    final int MAX_CAPACITY = 1000;
    final int LEAKAGE_AMOUNT = 5;

    int currentWater = 0;

    void fillWater() {

        System.out.print("Enter amount of water to fill: ");
        int amount = input.nextInt();

        if (amount <= 0) {

            System.out.println("Invalid Water Amount");

        } else if (currentWater + amount > MAX_CAPACITY) {

            System.out.println("Tank Overflow Risk");

        } else {

            currentWater += amount;

            System.out.println("Water Added Successfully");

            double tankFilled = (currentWater * 100.0) / MAX_CAPACITY;

            if (tankFilled >= 90) {
                System.out.println("Tank Almost Full");
            }
        }
    }

    void useWater() {

        System.out.print("Enter amount of water to use: ");
        int usingAmount = input.nextInt();

        if (usingAmount <= 0) {

            System.out.println("Invalid Water Usage");

        } else if (usingAmount > currentWater) {

            System.out.println("Insufficient Water");

        } else {

            currentWater -= usingAmount;

            System.out.println("Water Used Successfully");
        }
    }

    void tankStatus() {

        // Leakage Logic
        if (currentWater >= LEAKAGE_AMOUNT) {

            currentWater -= LEAKAGE_AMOUNT;

        } else {

            currentWater = 0;
        }

        int availableSpace = MAX_CAPACITY - currentWater;

        double tankFilled = (currentWater * 100.0) / MAX_CAPACITY;

        System.out.println("\n===== TANK STATUS =====");

        System.out.println("Current Water: "
                + currentWater + " Liters");

        System.out.println("Available Space: "
                + availableSpace + " Liters");

        System.out.println("Tank Filled: "
                + tankFilled + "%");

        System.out.println("Leakage: "
                + LEAKAGE_AMOUNT + " Liters");
    }

    void emergencyDrain() {

        currentWater = 0;

        System.out.println(
                "Emergency Drain Activated");
    }

    void startSystem() {

        boolean running = true;

        while (running) {

            System.out.println("\n===== MENU =====");

            System.out.println("1. Fill Water");
            System.out.println("2. Use Water");
            System.out.println("3. View Tank Status");
            System.out.println("4. Emergency Drain");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            if (choice == 1) {

                fillWater();

            } else if (choice == 2) {

                useWater();

            } else if (choice == 3) {

                tankStatus();

            } else if (choice == 4) {

                emergencyDrain();

            } else if (choice == 5) {

                running = false;

                System.out.println("Thank You");

            } else {

                System.out.println("Invalid Option");
            }
        }
    }

    public static void main(String[] args) {

        SmartWaterTankSystem tank = new SmartWaterTankSystem();

        System.out.print("Enter Login Username: ");
        String name = tank.input.nextLine();

        System.out.print("Enter Login Password: ");
        int password = tank.input.nextInt();

        if (name.equals("Manager")
                && password == 1234) {

            System.out.println("Login Successful");

            tank.startSystem();

        } else {

            System.out.println(
                    "Invalid Username or Password");
        }

        tank.input.close();
    }
}