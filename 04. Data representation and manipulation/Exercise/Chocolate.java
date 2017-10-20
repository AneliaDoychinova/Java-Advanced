import java.util.Arrays;
import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] chocolates = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int count = Integer.parseInt(scanner.nextLine());

        Arrays.sort(chocolates);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < chocolates.length-count+1; i++) {
           int currentDiff = Math.abs(chocolates[i] - chocolates[i+count-1]);
           if(currentDiff < minDiff){
               minDiff = currentDiff;
           }
        }
        System.out.printf("Min Difference is %d.", minDiff);
    }
}
