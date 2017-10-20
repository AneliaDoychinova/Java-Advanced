import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        for (int i = 0; i < Math.min(matrix.length-2, matrix.length); i++) {
            for (int j = 0; j < Math.min(matrix[0].length-2,matrix.length); j++) {
                int sum = matrix[i][j] + matrix[i][j+1]+ matrix[i][j+2] + matrix[i+1][j] + matrix[i+1][j+1]+ matrix[i+1][j+2] +
                        matrix[i+2][j] + matrix[i+2][j+1]+ matrix[i+2][j+2];

                if (sum > maxSum){
                    maxSum = sum;
                    startRow = i;
                    startCol = j;
                }

            }
        }

        System.out.printf("Sum = %d", maxSum);
        System.out.println();
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
