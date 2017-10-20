import java.util.Arrays;
import java.util.Scanner;

public class BlurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long blurAmount = Long.parseLong(scanner.nextLine());
        String[] dimension = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimension[0]);
        int cols = Integer.parseInt(dimension[1]);

        long[][] matrix = new long[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
        }

        String[] coordinates = scanner.nextLine().split(" ");
        int coordinatesRow = Integer.parseInt(coordinates[0]);
        int coordinatesCol = Integer.parseInt(coordinates[1]);

        int startRow = Math.max(0, coordinatesRow-1);
        int endRow = Math.min(coordinatesRow+1, matrix.length-1);
        int startCol = Math.max(0, coordinatesCol-1);
        int endCol = Math.min(coordinatesCol+1, matrix[0].length-1);

        for (int i = startRow; i <= endRow; i++) {
            for (int j =  startCol;j <= endCol; j++) {
                matrix[i][j] += blurAmount;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
