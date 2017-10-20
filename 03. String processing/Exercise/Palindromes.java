import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> palindromes = new TreeSet<>();

        String[] words = scanner.nextLine().split("[ ,.?!]");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")){
                continue;
            }
            StringBuilder reversed = new StringBuilder(words[i]).reverse();

            if (words[i].equals(reversed.toString())){
                palindromes.add(words[i]);
            }
        }

        System.out.println(palindromes);

    }
}
