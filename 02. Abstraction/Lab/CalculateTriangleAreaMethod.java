import java.util.Scanner;

public class CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        scanner.nextLine();

        double area = calculateTriangleArea(base, height);
        printArea(area);
    }

    private static void printArea(double area) {
        System.out.printf("Area = %.2f",area);
    }

    private static double calculateTriangleArea(double base, double heigth) {
        return (base * heigth)/2;
    }
}
