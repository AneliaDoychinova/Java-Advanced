import java.util.Scanner;

public class ByteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int[] nums = new int[count];

        for (int i = 0; i < nums.length; i++) {
            nums[i] =  Integer.parseInt(scanner.nextLine());
        }

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("party")){
            String action = command[0];
            int position =  Integer.parseInt(command[1]);

            switch (action){
                case "-1":
                    int mask = 1 << position;
                    for (int i =0;i<nums.length;i++){
                        nums[i] = (nums[i] ^ mask);
                    }
                    break;
                case"0":
                    int mask0 = ~(1 << position);
                    for (int i =0;i<nums.length;i++){
                        nums[i] = (nums[i] & mask0);
                    }
                    break;
                case "1":
                    int mask1 = 1 << position;
                    for (int i =0;i<nums.length;i++){
                        nums[i] = (nums[i] | mask1);
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
