import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("END")){
            if (!command[0].equals("swap")){
                System.out.println("Invalid input!");
                command = scanner.nextLine().split(" ");
                continue;
            }
            if (command.length != 5){
                System.out.println("Invalid input!");
                command = scanner.nextLine().split(" ");
                continue;
            }

            int row1 = Integer.parseInt(command[1]);
            int col1 = Integer.parseInt(command[2]);
            int row2 = Integer.parseInt(command[3]);
            int col2 = Integer.parseInt(command[4]);

            try{
                String temp = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = temp;
                printMatrix(matrix);
            }
            catch (Exception ex){
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine().split(" ");
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
