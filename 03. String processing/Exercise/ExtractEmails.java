import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            sb.append(input).append("\r\n");
            input = scanner.nextLine();
        }

        Pattern pattern = Pattern.compile("(?<= |^)([a-z0-9][a-zA-Z._-]*)@([a-z][a-z-]*)(\\.[a-z0-9][a-z0-9-]*)+(?=[ .,]|$)");
        Matcher matcher = pattern.matcher(sb);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
