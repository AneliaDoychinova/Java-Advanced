import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        reverseArray(nums);
        printArray(nums);

    }

    private static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.printf(nums[i] + " ");
        }
    }

    private static void reverseArray(int[] nums) {
        reverse(nums,0,nums.length-1);
    }

    private static void reverse(int[] x, int i, int j) {

        if(i<j){//Swap
            int tmp = x[i];
            x[i] = x[j];
            x[j] = tmp;
            reverse(x, ++i, --j);//Recursive
        }
    }
}
