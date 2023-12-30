import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get marks in each subject
        System.out.println("Enter marks obtained in Physics (out of 100): ");
        int physicsMarks = scanner.nextInt();

        System.out.println("Enter marks obtained in Chemistry (out of 100): ");
        int chemistryMarks = scanner.nextInt();

        System.out.println("Enter marks obtained in Mathematics (out of 100): ");
        int mathsMarks = scanner.nextInt();

        // Calculate total marks and average percentage
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double averagePercentage = (totalMarks * 1.0) / 3;

        // Grade calculation
        String grade = "A+";
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}