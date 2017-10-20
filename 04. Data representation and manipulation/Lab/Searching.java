import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Searching {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(bf.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int wantedNum = Integer.parseInt(bf.readLine());

      //System.out.println(linearSearch(nums, wantedNum));
      System.out.println(binarySearch(nums, wantedNum));
    }

    private static int linearSearch(int[] nums, int wantedNum) {
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == wantedNum){
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] nums, int wantedNum) {
        int start = 0;
        int end = nums.length;
        if (wantedNum > nums[nums.length-1]){
            return -1;
        }

        while (end >= start){
            int mid = start + (end-start)/2;
            if (nums[mid] > wantedNum){
                end = mid-1;
            }
            else if (nums[mid]<wantedNum){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
