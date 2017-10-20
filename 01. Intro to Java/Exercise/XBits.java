import java.util.Scanner;

public class XBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] nums = new String[8];

        for (int i = 0; i < nums.length; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            nums[i] = String.format("%32s", Integer.toBinaryString(number)).replace(' ','0');
        }
        int counter = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = 0; j < nums[i].length() - 2; j++) {
                String a = nums[i].charAt(j) + "" + nums[i].charAt(j+1) + nums[i].charAt(j+2);
                String b = nums[i+1].charAt(j) + "" + nums[i+1].charAt(j+1) + nums[i+1].charAt(j+2);
                String c = nums[i+2].charAt(j) + "" + nums[i+2].charAt(j+1) + nums[i+2].charAt(j+2);

                if (a.equals("101") && b.equals("010") && c.equals("101")){
                    counter++;
                }
            }
            
        }

        System.out.println(counter);
    }
}
