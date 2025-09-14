import java.util.Scanner;

public class ChadCleaningRobot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of columns for the ballot
        System.out.print("Enter the number of ballot rectangles: ");
        int numRectangles = scanner.nextInt();

        // Create a ballot (2D array)
        boolean[][] ballot = new boolean[numRectangles][3];

        // Input the ballot data
        System.out.println("Enter the ballot data (1 for beeper, 0 for empty):");
        for (int i = 0; i < numRectangles; i++) {
            for (int j = 0; j < 3; j++) {
                ballot[i][j] = scanner.nextInt() == 1;
            }
        }

        // Process each ballot rectangle
        for (int i = 0; i < numRectangles; i++) {
            processBallot(ballot, i);
        }

        // Display the final ballot
        System.out.println("Final ballot:");
        for (int i = 0; i < numRectangles; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((ballot[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void processBallot(boolean[][] ballot, int index) {
        // Check the middle square (row 1)
        if (!ballot[index][1]) {
            // If middle square is empty, clean the top (row 0) and bottom (row 2)
            cleanSquare(ballot, index, 0); // Clean top
            cleanSquare(ballot, index, 2); // Clean bottom
        }
    }

    private static void cleanSquare(boolean[][] ballot, int index, int row) {
        // Remove the beeper by setting the square to false
        ballot[index][row] = false;
    }
}