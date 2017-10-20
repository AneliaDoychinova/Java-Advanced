import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceInMatrix {

    private static List<String> finalResult = new ArrayList<>();
    private static List<String> tempResult = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tryDiagonal(matrix, i, j);
                tryRow(matrix, i, j);
            }
        }
        System.out.println(finalResult.toString().replaceAll("[\\[\\]]", ""));
    }

    private static void tryRow(String[][] matrix, int row, int col) {
        tempResult.clear();
        tempResult.add(matrix[row][col]);
        for (int i = row; i < matrix.length - 1; i++) {
            if(matrix[i][col].equals(matrix[i+1][col])) {
                tempResult.add(matrix[i][col]);
            } else {
                break;
            }
        }
        checkIsCurrentSequenceLongest();
    }

    private static void checkIsCurrentSequenceLongest() {
        if(tempResult.size() >= finalResult.size()) {
            finalResult.clear();
            for (String aTempResult : tempResult) {
                finalResult.add(aTempResult);
            }
        }
    }

    private static void tryDiagonal(String[][] matrix, int row, int col) {

        tempResult.clear();
        tempResult.add(matrix[row][col]);
        for (int k = row; k < Math.min(matrix.length - 1, matrix[row].length - 1); k++) {
            if (matrix[k][k].equals(matrix[k + 1][k + 1])) {
                tempResult.add(matrix[k][k]);
            } else {
                break;
            }
        }
        checkIsCurrentSequenceLongest();
    }
}