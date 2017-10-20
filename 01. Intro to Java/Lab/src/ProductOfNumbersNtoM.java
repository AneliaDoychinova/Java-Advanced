import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbersNtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BigInteger result = BigInteger.ONE;
        int firstNum = n;
        do {
            BigInteger number = new BigInteger(""+firstNum);
            result = result.multiply(number);
            firstNum++;
        }
        while (firstNum <= m);

        System.out.printf("product[%d..%d] = %d", n,m,result);
    }
}
