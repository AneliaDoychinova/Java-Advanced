import java.util.Arrays;
import java.util.Scanner;

public class RecirsiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        System.out.println(sumOfElements(nums, 0));
    }

    private static int sumOfElements(int[] nums, int index) {

        if (index == nums.length-1){
            return nums[index];
        }

        return nums[index] + sumOfElements(nums, index+1);
    }
}
