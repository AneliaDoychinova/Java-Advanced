import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger[][] triangle = new BigInteger[n][];
        int currentWidth = 1;

        for (int row = 0; row<triangle.length;row++){
            triangle[row] = new BigInteger[currentWidth];
            BigInteger[] currentRow = triangle[row];
            currentWidth++;
            triangle[row][0]= BigInteger.ONE;
            triangle[row][row] = BigInteger.ONE;

            if (currentRow.length > 2){
                for (int col=1;col< currentRow.length - 1;col++){
                    BigInteger[] previousRow = triangle[row-1];
                    BigInteger sum = previousRow[col-1].add(previousRow[col]);
                    triangle[row][col] = sum;
                }
            }
        }

        for (int i = 0; i < triangle.length; i++) {
            System.out.println(Arrays.toString(triangle[i]).replace("[","").replace("]","").replace(",",""));
        }
    }
}
