import java.util.Scanner;

public class CollectTheCoins {
    static int coins;
    static int walls;
    static int row;
    static int col;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 4;

        char[][] matrix = new char[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }

        char[] path = scanner.nextLine().toCharArray();

        for (int i = 0; i < path.length; i++) {
            char command = path[i];
            checkForCoins(command,matrix);

            }
        System.out.printf("Coins = %d%n", coins);
        System.out.printf("Walls = %d", walls);
    }

    private static void checkForCoins(char command,char[][] matrix) {
        switch (command) {
            case 'V':
                row += 1;
                try {
                    if (matrix[row][col] == '$') {
                        coins++;
                    }
                } catch (Exception ex) {
                    walls++;
                    row -= 1;
                }
                break;
            case '>':
                col += 1;
                try {
                    if (matrix[row][col] == '$') {
                        coins++;
                    }
                } catch (Exception ex) {
                    walls++;
                    col -= 1;
                }
                break;
            case '<':
                col -= 1;
                try {
                    if (matrix[row][col] == '$') {
                        coins++;
                    }
                } catch (Exception ex) {
                    walls++;
                    col += 1;
                }
                break;
            case '^':
                row -= 1;
                try {
                    if (matrix[row][col] == '$') {
                        coins++;
                    }
                } catch (Exception ex) {
                    walls++;
                    row += 1;
                }
                break;
        }

    }
}
