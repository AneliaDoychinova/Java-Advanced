import javax.print.DocFlavor;
import java.math.BigDecimal;
import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s+");
        String end = scanner.nextLine();

        double totalSum = 0;

        for (int i = 0; i < strings.length; i++) {
                char firstChar = strings[i].charAt(0);
                char secondChar = strings[i].charAt(strings[i].length()-1);

                double num = Double.parseDouble(strings[i].substring(1, strings[i].length()-1));

                if (Character.isUpperCase(firstChar)) {
                    num = num/(Character.toLowerCase(firstChar) - 96);
                } else {
                    num = num*(firstChar- 96);
                }

                if (Character.isUpperCase(secondChar)) {
                    num = num-(Character.toLowerCase(secondChar) - 96);
                } else {
                    num = num+(secondChar - 96);
                }

                totalSum += num;
        }

        System.out.printf("%.2f", totalSum);
    }
}
