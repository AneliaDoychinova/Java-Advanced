import java.math.BigInteger;
import java.util.Scanner;

public class CombinationsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = new BigInteger(scanner.nextLine());
        BigInteger k = new BigInteger(scanner.nextLine());

        System.out.println(nChooseKCombinations(n,k));
    }

    private static BigInteger nChooseKCombinations(BigInteger n, BigInteger k) {

        return  (factorial(n).divide(factorial(n.subtract(k))).divide(factorial(k)));

    }

    private static BigInteger factorial(BigInteger n) {
        if (n.intValue() == 0){
            return new BigInteger("1");
        }
        if (n.intValue() == 1){
            return n;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
