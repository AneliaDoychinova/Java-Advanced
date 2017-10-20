import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix;
        if (pattern.equals("A")) {
            matrix = fillTheMatrixA(rows);
        } else {
            matrix = fillTheMatrixB(rows);
        }

        printMatrix(matrix);
    }

    private static int[][] fillTheMatrixA(int rows) {
        int[][] matrix = new int[rows][rows];
        int cnt = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = cnt;
                cnt++;
            }

        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]).replace("[","").replace("]","").replace(",",""));
        }
    }

    private static int[][] fillTheMatrixB(int rows) {
        int[][] matrix = new int[rows][rows];
        int cnt = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 == 0) {
                    matrix[j][i] = cnt++;
                } else {
                    matrix[matrix.length - 1 - j][i] = cnt++;
                }
            }
        }
            return matrix;

    }
}

