import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalidromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();

        String[][] matrix = generateMatrix(r,c);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]).replace("[", "").replace("]", "").replace(",", ""));
        }
    }

    private static String[][] generateMatrix(int r, int c) {
        String[][] matrix = new String[r][c];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = fillTheMatrix(i,j);
            }
            
        }
        return matrix;
    }

    private static String fillTheMatrix(int row, int column) {
        String result = "";
        result = (char)(row+97) + "" + (char)(row+column+97) + (char)(row+97);
        return result;
    }
}
