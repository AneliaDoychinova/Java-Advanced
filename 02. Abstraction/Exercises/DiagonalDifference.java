import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int diff = sumDiagonals(matrix);
        System.out.println(diff);
    }


    private static int sumDiagonals(int[][] matrix) {
        int sumPrimary = 0;
        int sumSecondary = 0;
        int diff = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j){
                    sumPrimary += matrix[i][j];
                }
                if (j == matrix.length - i - 1){
                    sumSecondary+= matrix[i][j];
                }
            }
        }
        diff = Math.abs(sumPrimary - sumSecondary);
        return diff;
    }
}
