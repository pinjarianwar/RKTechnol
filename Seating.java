import java.util.*;

public class Seating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Prompt the user to enter the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = sc.nextInt();

        // Calculate the total number of seats available
        int numSeats = numRows * numCols;

        // Check if there are enough seats for all the students
        if (numStudents > numSeats) {
            System.out.println("There are not enough seats for all the students!");
            return;
        }

        // Create a 2D array to represent the seating arrangement
        int[][] seatingArrangement = new int[numRows][numCols];

        // Assign seats to students
        int studentNumber = 1;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (studentNumber <= numStudents) {
                    seatingArrangement[i][j] = studentNumber;
                    studentNumber++;
                }
            }
        }

        // Print the seating arrangement
        System.out.println("Seating Arrangement:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (seatingArrangement[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.printf("%2d", seatingArrangement[i][j]);
                }
            }
            System.out.println();
        }
    }
}
