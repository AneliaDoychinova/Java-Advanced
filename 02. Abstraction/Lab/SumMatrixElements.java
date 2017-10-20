import java.util.Arrays;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.print;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int cols = input[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        int sum = calculateSum(matrix);

        print(matrix,sum);

    }
    private static void print(int[][] matrix, int sum){
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
    }
    private static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
