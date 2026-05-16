import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = "";
        int age = 0;
        int marks = 0;
        double attendance = 0;

        int choice;
        boolean running = true;

        while (running) {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Show Student Details");
            System.out.println("2. Add / Update Student");
            System.out.println("3. Check Result");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {

                if (name.equals("")) {
                    System.out.println("No Student Record Found");

                } else {

                    System.out.println("\n===== STUDENT DETAILS =====");
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Marks: " + marks);
                    System.out.println("Attendance: " + attendance);
                }

            } else if (choice == 2) {

                System.out.print("Enter Name: ");
                name = input.nextLine();

                System.out.print("Enter Age: ");
                age = input.nextInt();

                System.out.print("Enter Marks: ");
                marks = input.nextInt();

                while (marks < 0 || marks > 100) {
                    System.out.print("Invalid Marks. Enter again: ");
                    marks = input.nextInt();
                }

                System.out.print("Enter Attendance: ");
                attendance = input.nextDouble();

                System.out.println("Student Saved Successfully");

            } else if (choice == 3) {

                if (name.equals("")) {
                    System.out.println("No Student Record Found");

                } else {

                    System.out.println("\n===== RESULT =====");

                    System.out.println("Name: " + name);
                    System.out.println("Marks: " + marks);
                    System.out.println("Attendance: " + attendance);

                    boolean passed = marks >= 50;
                    boolean eligible = attendance >= 75;

                    System.out.println("Passed: " + passed);

                    if (!eligible) {
                        System.out.println("Not Eligible For Exam");

                    } else if (marks >= 90) {
                        System.out.println("Grade A");

                    } else if (marks >= 75) {
                        System.out.println("Grade B");

                    } else if (marks >= 50) {
                        System.out.println("Grade C");

                    } else {
                        System.out.println("Fail");
                    }
                }

            } else if (choice == 4) {

                System.out.println("Program Ended");
                running = false;

            } else {

                System.out.println("Invalid Option");
            }
        }

        input.close();
    }
}