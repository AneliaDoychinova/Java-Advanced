import javax.print.DocFlavor;
import java.util.Scanner;

public class OverlappingIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] time = new int[2*n];
        for (int i = 0; i < time.length; i=i+2) {
            String[] input = scanner.nextLine().split(",");
            time[i] = Integer.parseInt(input[0]);
            time[i+1] = Integer.parseInt(input[1]);
        }

        boolean isOverlap = false;

        for (int i = 0; i < time.length; i=i+2) {
            int start = time[i];
            int end = time[i+1];

            for (int j = i+2; j <time.length ; j=j+2) {
                if (time[j] >= start && time[j] <= end){
                    isOverlap = true;
                    break;
                }
            }

            if (isOverlap){
                break;
            }
        }
        System.out.println(isOverlap);

    }
}
