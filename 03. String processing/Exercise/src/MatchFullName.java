import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]+\\s{1}[A-Z]{1}[a-z]+$");

        while (!input.equals("end")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                System.out.println(input);
            }

            input = scanner.nextLine();
        }
    }
}

