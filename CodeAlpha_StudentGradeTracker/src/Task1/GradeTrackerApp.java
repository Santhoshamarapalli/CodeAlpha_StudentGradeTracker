package Task1;

import java.util.Scanner;

public class GradeTrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManager manager = new GradeManager();

        while (true) {
            System.out.println("\n--- Student Grade Tracker ---");
            System.out.println("1. Add Student and Grade");
            System.out.println("2. View Summary Report");
            System.out.println("3. Exit Program");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter grade: ");
                double grade = scanner.nextDouble();
                scanner.nextLine();
                manager.addStudent(new Student(name, grade));
                System.out.println("Student added successfully.");
            } else if (choice == 2) {
                if (manager.getStudents().isEmpty()) {
                    System.out.println("No students added yet.");
                } else {
                    System.out.println("\n--- Summary Report ---");
                    for (Student student : manager.getStudents()) {
                        System.out.println("Student Name: " + student.getName() + ", Grade: " + student.getGrade());
                    }
                    System.out.println("Average Grade: " + manager.calculateAverage());
                    System.out.println("Highest Grade: " + manager.findTopStudent().getGrade() + " by " + manager.findTopStudent().getName());
                    System.out.println("Lowest Grade: " + manager.findLowestStudent().getGrade() + " by " + manager.findLowestStudent().getName());
                }
            } else if (choice == 3) {
                System.out.println("Exiting program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
