import java.util.Scanner;

public class StudentEnrollment {

    // Constants
    private static final int FEE_PER_UNIT = 1000; // Fee per unit in PHP
    private static final int MAX_SUBJECTS = 10; // Maximum number of subjects

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input necessary student information
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine(); // Input student name

        System.out.print("Enter Course: ");
        String course = scanner.nextLine(); // Input course name

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine(); // Input course code

        // Input the number of units for subjects
        int totalUnits = 0; // Initialize total units
        for (int i = 1; i <= MAX_SUBJECTS; i++) {
            System.out.print("Enter number of units for subject " + i + " (or enter 0 to finish): ");
            int units = scanner.nextInt();
            if (units == 0) {
                break; // Stop if user enters 0
            }
            totalUnits += units; // Add units to total
        }

        // Compute total enrollment fee
        int totalFee = totalUnits * FEE_PER_UNIT;

        // Output student's name and total enrollment fee
        System.out.println("\n--- Enrollment Summary ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Total Enrollment Fee: PHP " + totalFee);

        // Ask for payment amount
        System.out.print("\nEnter Payment Amount: ");
        int payment = scanner.nextInt();

        // Determine payment status
        if (payment == totalFee) {
            System.out.println("Status: Fully Paid");
        } else if (payment < totalFee) {
            int balance = totalFee - payment;
            System.out.println("Status: Partial Payment");
            System.out.println("Amount Paid: PHP " + payment);
            System.out.println("Remaining Balance: PHP " + balance);
        } else {
            System.out.println("Payment exceeds the total fee. Please enter the correct amount.");
        }

        // Close the scanner
        scanner.close();
    }
}