import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceATag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        String input = scanner.nextLine();

        while (!input.equals("END")){
            sb.append(input).append("\r\n");
            input = scanner.nextLine();
        }

        Pattern regex = Pattern.compile("<a(.+?)>(.*?)</a>", Pattern.DOTALL);
        String replacement = "[URL$1]$2[/URL]";
        Matcher matcher = regex.matcher(sb);

        String result = matcher.replaceAll(replacement);
        System.out.println(result);

    }
}
