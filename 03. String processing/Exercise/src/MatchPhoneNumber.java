import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\+359([ -])2\\1\\d{3}\\1\\d{4}$");

        while (!number.equals("end")) {
            Matcher matcher = pattern.matcher(number);

            if (matcher.find()) {
                System.out.println(number);
            }

            number = scanner.nextLine();
        }
    }
}
