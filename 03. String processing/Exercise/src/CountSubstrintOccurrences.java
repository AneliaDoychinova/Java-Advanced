import java.util.Scanner;

public class CountSubstrintOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String lowerText = text.toLowerCase();
        String word = scanner.nextLine().toLowerCase();

        int count = 0;
        int index = lowerText.indexOf(word);

        while (index != -1) {
            count++;
            index = lowerText.indexOf(word, index+1);
        }
        System.out.println(count);
    }
}
