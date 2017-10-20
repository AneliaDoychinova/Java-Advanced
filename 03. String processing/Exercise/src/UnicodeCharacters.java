import java.util.Scanner;

public class UnicodeCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            result.append(String.format("\\u%04x", (int) text.charAt(i)));
        }
        System.out.println(result);
    }
}
