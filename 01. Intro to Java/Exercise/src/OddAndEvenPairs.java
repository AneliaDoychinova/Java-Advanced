import java.util.Arrays;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        if (arr.length%2 == 1){
            System.out.println("invalid length");
            return;
        }
        for (int i = 0; i < arr.length-1; i+=2) {
            if (arr[i]%2==0 && arr[i+1]%2==0){
                System.out.printf("%d, %d -> both are even\n", arr[i], arr[i+1]);
            }
            else if (arr[i]%2==1 && arr[i+1]%2==1){
                System.out.printf("%d, %d -> both are odd\n", arr[i], arr[i+1]);
            }
            else{
                System.out.printf("%d, %d -> different\n", arr[i], arr[i+1]);
            }

        }
    }
}
