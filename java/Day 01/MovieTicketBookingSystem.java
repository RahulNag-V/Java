import java.util.Scanner;

public class MovieTicketBookingSystem {

    Scanner input = new Scanner(System.in);

    int totalSeats = 10;
    int bookedSeats = 0;
    int totalRevenue = 0;

    void cancelTicket() {

        if (bookedSeats == 0) {
            System.out.println("No Tickets Booked Yet");
            return;
        }

        System.out.println("1. VIP Cancel");
        System.out.println("2. Regular Cancel");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        if (choice == 1) {

            totalRevenue -= 300;
            bookedSeats--;

            System.out.println("VIP Ticket Cancelled Successfully");

        } else if (choice == 2) {

            System.out.println("===== Regular Cancel Menu =====");
            System.out.println("1. Front Seat");
            System.out.println("2. Middle Seat");
            System.out.println("3. Balcony Seat");

            System.out.print("Choose your seat: ");
            int cancelTicket = input.nextInt();

            if (cancelTicket == 1) {

                totalRevenue -= 100;
                bookedSeats--;

                System.out.println("Front Seat Ticket Cancelled Successfully");

            } else if (cancelTicket == 2) {

                totalRevenue -= 150;
                bookedSeats--;

                System.out.println("Middle Seat Ticket Cancelled Successfully");

            } else if (cancelTicket == 3) {

                totalRevenue -= 200;
                bookedSeats--;

                System.out.println("Balcony Seat Ticket Cancelled Successfully");

            } else {

                System.out.println("Invalid Choice");
            }

        } else {

            System.out.println("Invalid Choice");
        }
    }

    void theaterStatus() {

        double availableSeats = totalSeats - bookedSeats;

        double seatOccupied = ((double) bookedSeats / totalSeats) * 100;

        System.out.println("\n===== THEATER STATUS =====");

        System.out.println("Total Seats: " + totalSeats);

        System.out.println("Booked Seats: " + bookedSeats);

        System.out.println("Available Seats: " + availableSeats);

        System.out.println("Seat Occupied: " + seatOccupied + "%");

        System.out.println("Total Revenue: " + totalRevenue);
    }

    void menu() {

        int choice;

        boolean running = true;

        while (running) {

            double seatOccupied = ((double) bookedSeats / totalSeats) * 100;

            System.out.println("\n===== MENU =====");

            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Theater Status");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice == 1) {

                if (bookedSeats >= totalSeats) {

                    System.out.println("All Seats Are Full");
                    continue;
                }

                System.out.println("1. Regular Ticket");
                System.out.println("2. VIP Ticket");

                System.out.print("Enter your choice: ");

                int ticketChoice = input.nextInt();

                if (ticketChoice == 1) {

                    if (seatOccupied >= 90) {

                        System.out.println("Sorry, 90% or more seats occupied");

                    } else {

                        System.out.println("===== Regular Ticket Menu =====");

                        System.out.println("1. Front Seat");
                        System.out.println("2. Middle Seat");
                        System.out.println("3. Balcony Seat");

                        System.out.print("Enter your choice: ");

                        int seatChoice = input.nextInt();

                        if (seatChoice == 1) {

                            bookedSeats++;
                            totalRevenue += 100;

                            System.out.println("Front Seat Ticket Booked Successfully");

                        } else if (seatChoice == 2) {

                            bookedSeats++;
                            totalRevenue += 150;

                            System.out.println("Middle Seat Ticket Booked Successfully");

                        } else if (seatChoice == 3) {

                            bookedSeats++;
                            totalRevenue += 200;

                            System.out.println("Balcony Seat Ticket Booked Successfully");

                        } else {

                            System.out.println("Invalid Choice");
                        }
                    }

                } else if (ticketChoice == 2) {

                    bookedSeats++;
                    totalRevenue += 300;

                    System.out.println("VIP Ticket Booked Successfully");

                } else {

                    System.out.println("Invalid Choice");
                }

            } else if (choice == 2) {

                cancelTicket();

            } else if (choice == 3) {

                theaterStatus();

            } else if (choice == 4) {

                running = false;

                System.out.println("Thank You");

            } else {

                System.out.println("Invalid Option");
            }
        }
    }

    public static void main(String[] args) {

        MovieTicketBookingSystem movie = new MovieTicketBookingSystem();

        System.out.print("Enter Login Username: ");

        String name = movie.input.nextLine();

        System.out.print("Enter Login Password: ");

        int password = movie.input.nextInt();

        if (name.equals("Manager") && password == 1234) {

            System.out.println("Login Successful");

            movie.menu();

        } else {

            System.out.println("Invalid Username or Password");
        }

        movie.input.close();
    }
}

// ================= ERRORS & IMPROVEMENTS =================

// 1. availableSeats variable was outside methods
// Problem:
// availableSeats was calculated only once.
// After booking/cancelling tickets it never updated.

// Fix:
// Move availableSeats calculation inside theaterStatus() method.

// 2. Wrong variable used inside conditions
// Problem:
// You used:
// else if (choice == 2)
//
// But it should be:
// else if (seatChoice == 2)
//
// Because you are checking seat option,
// not menu option.

// This is a LOGICAL ERROR.

// 3. Wrong revenue subtraction in cancelTicket()
// Problem:
// You added:
// Front Seat = 100
// Middle Seat = 150
// Balcony Seat = 200
//
// But while cancelling you subtracted:
// 20, 50, 80
//
// Revenue logic became incorrect.

// Fix:
// Subtract the actual ticket price.

// 4. seatOccupied value was not updating properly
// Problem:
// seatOccupied was calculated once before loop.
// After booking tickets it remained old value.

// Fix:
// Calculate seatOccupied inside while loop.

// 5. No full seat checking
// Problem:
// bookedSeats could become greater than totalSeats.

// Fix:
// Add:
// if(bookedSeats >= totalSeats)

// 6. No early return in cancelTicket()
// Problem:
// Even if no tickets booked,
// program still showed cancel menu.

// Fix:
// Use:
// return;

// 7. Code duplication
// Problem:
// bookedSeats++ and totalRevenue +=
// repeated many times.

// Improvement:
// Later learn methods/functions
// to reduce repetition.

// 8. Variable naming can improve
// Example:
// movie -> movieSystem
// choice -> menuChoice

// Better names = professional code.

// 9. Formatting inconsistency
// Some spacing and indentation
// were inconsistent.

// Proper formatting improves readability.

// 10. No input validation
// If user enters string instead of int,
// program crashes.

// Later learn:
// try-catch
// input validation