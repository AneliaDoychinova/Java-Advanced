import java.util.Arrays;
import java.util.Scanner;

public class FirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[] command = scanner.nextLine().split("\\s+");

        int count = Integer.parseInt(command[1]);
        String number = command[2];
        int cnt = 0;
        if (number.equals("even")) {
            for (int anArr : arr) {
                if (cnt >= count) {
                    break;
                }
                if (Math.abs(anArr) % 2 == 0) {
                    cnt++;
                    System.out.printf(anArr + " ");
                }
            }
        } else if (number.equals("odd")) {
            for (int anArr : arr) {
                if (cnt >= count) {
                    break;
                }
                if (Math.abs(anArr) % 2 == 1) {
                    cnt++;
                    System.out.printf(anArr + " ");
                }
            }


        }
    }
}
