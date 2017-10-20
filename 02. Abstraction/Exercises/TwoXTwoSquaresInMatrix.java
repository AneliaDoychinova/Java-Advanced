import java.util.Scanner;

public class TwoXTwoSquaresInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        scanner.nextLine();

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split(" ");

        }
        int counter = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length -1 ; j++) {
                if (matrix[i][j].equals(matrix[i][j+1]) && matrix[i][j+1].equals(matrix[i+1][j]) &&
                       matrix[i+1][j].equals( matrix[i+1][j+1])){
                    counter++;
                }

            }

        }
        System.out.println(counter);
    }
}
