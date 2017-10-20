import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantity = scanner.nextDouble();
        double price = 1.20;
        BigDecimal priceInLevs = new BigDecimal(quantity * price);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");

        BigDecimal priceInMarks = exchangeRate.multiply(priceInLevs);

        System.out.printf("%.2f marks", priceInMarks);
    }
}
