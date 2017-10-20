import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ImplementBinarySearchUsingRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(bf.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int key = Integer.parseInt(bf.readLine());

        System.out.println(binarySearch(nums,key,0, nums.length));
    }

    private static int binarySearch(int[] nums, int key, int lo, int hi) {
        if (key > nums[nums.length-1]){
            return -1;
        }
        if (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (key<nums[mid]){
                return binarySearch(nums, key, lo, mid-1);
            }
            else if (key>nums[mid]){
                return binarySearch(nums, key, mid+1, hi);
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
