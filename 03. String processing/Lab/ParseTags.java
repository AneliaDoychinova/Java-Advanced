import java.util.Scanner;

public class ParseTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String upcaseStart = "<upcase>";
        String upcaseEnd = "</upcase>";
        StringBuilder result = new StringBuilder();

        while (text.contains(upcaseStart)){
            int startIndex = text.indexOf(upcaseStart);
            int endIndex = text.indexOf(upcaseEnd);

            result.append(text.substring(0,startIndex));
            result.append(text.substring(startIndex+upcaseStart.length(), endIndex).toUpperCase());
            text = text.substring(endIndex+upcaseEnd.length());
        }
        result.append(text);
        System.out.println(result.toString());
    }
}
