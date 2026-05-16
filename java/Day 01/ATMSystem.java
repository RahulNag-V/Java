import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 1000;
        int choice;
        boolean running = true;

        while (running) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.println("Current Balance: " + balance);

            } else if (choice == 2) {

                System.out.print("Enter deposit amount: ");
                double deposit = input.nextDouble();

                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("Amount Deposited Successfully");
                    System.out.println("Updated Balance: " + balance);

                } else {
                    System.out.println("Invalid Deposit Amount");
                }

            } else if (choice == 3) {

                System.out.print("Enter withdrawal amount: ");
                double withdraw = input.nextDouble();

                if (withdraw > balance) {
                    System.out.println("Insufficient Balance");

                } else if (withdraw <= 0) {
                    System.out.println("Invalid Withdrawal Amount");

                } else {
                    balance = balance - withdraw;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Remaining Balance: " + balance);
                }

            } else if (choice == 4) {

                System.out.println("Thank You");
                running = false;

            } else {

                System.out.println("Invalid Option");
            }
        }

        input.close();
    }
}