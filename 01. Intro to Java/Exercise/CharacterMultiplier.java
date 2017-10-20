
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\s+");
        String str1 = arr[0];
        String str2 = arr[1];

        long sum = 0L;

        for (int i = 0; i < Math.max(str1.length(), str2.length()); i++) {

            if (i >= str1.length()){
                sum+= str2.charAt(i);
            }
            else if (i >= str2.length()){
                sum+= str1.charAt(i);
            }
            else {
                sum += str1.charAt(i) * str2.charAt(i);
            }
        }

        System.out.println(sum);
    }
}
