import java.util.Arrays;
import java.util.Scanner;


public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);

        //bubbleSort(nums);
        selectionSort(nums);

        printArray(nums);
    }

    private static void printArray(Integer[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.printf(nums[i]+ " ");
        }
    }

    private static void selectionSort(Integer[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[j] < nums[min]){
                    min = j;
                }
            }

            swap(nums, min, i);
        }
    }

    private static void swap(Integer[] nums, int min, int index) {
        int temp = nums[min];
        nums[min] = nums[index];
        nums[index] = temp;
    }

    private static void bubbleSort(Integer[] nums) {
        boolean swapped = true;
        do {
            swapped = false;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i]< nums[i-1]){
                    swap(nums, i, i-1);
                    swapped = true;
                }
            }
        }
        while (swapped);
    }
}
