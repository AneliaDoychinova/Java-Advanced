import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeriesOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] inputChar = input.toCharArray();
        StringBuilder result = new StringBuilder();

        char temp = inputChar[0];
        for (int index = 1; index < input.length(); index++) {
            char val = inputChar[index];

            if (val != temp){
                result.append(temp);
                temp = val;
            }

            if (index == input.length() - 1){
                result.append(inputChar[index]);
            }
        }
        System.out.println(result.toString());
    }
}
