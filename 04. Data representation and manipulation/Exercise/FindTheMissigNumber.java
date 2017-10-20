import java.util.Arrays;
import java.util.Scanner;

public class FindTheMissigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] nums = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if (nums[0]!= 1){
                System.out.println(1);
                return;
            }
            if (nums[i+1] - nums[i] != 1){
                System.out.println((nums[i+1] + nums[i])/2);
                return;
            }
        }
        System.out.println(n);
    }
}
