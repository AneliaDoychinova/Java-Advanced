import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distance = scanner.nextDouble();
        scanner.nextLine();
        String shift = scanner.nextLine();
        Double totalPrice = 0d;

        double initialTax = 0.7;
        double daytimeTaxiCost = 0.79;
        double nighttimeTaxiCost = 0.9;
        double busCost = 0.09;
        double trainCost = 0.06;

        if (distance<20){
            if (shift.equals("day")){
               totalPrice = initialTax + daytimeTaxiCost*distance;
            }
            else{
                totalPrice = initialTax + nighttimeTaxiCost * distance;
            }
        }
        else if (distance < 100){
            totalPrice = busCost * distance;
        }
        else{
            totalPrice = trainCost * distance;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
