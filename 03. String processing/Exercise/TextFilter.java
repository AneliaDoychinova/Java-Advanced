import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split("[, ]");
        String text = scanner.nextLine();

        for (String word:bannedWords
             ) {
            if (text.contains(word)){
                int count = word.length();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < count; i++) {
                  sb.append('*');
                }
               int index = text.indexOf(word);
                text = text.replace(word, sb.toString());
            }

        }

        System.out.println(text);
    }
}
