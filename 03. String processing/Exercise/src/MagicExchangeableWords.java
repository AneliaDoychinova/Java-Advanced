import java.util.HashMap;
import java.util.Scanner;

public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        String word1 = words[0];
        String word2 = words[1];

        boolean result = areExchangeable(word1, word2);
        System.out.println(result);
    }

    private static boolean areExchangeable(String word1, String word2) {
        String shorter = "";
        String longer = "";

        if (word1.length() > word2.length()) {
            shorter = word2;
            longer = word1;
        } else {
            shorter = word1;
            longer = word2;
        }
        HashMap<Character, Character> mappings = new HashMap<>();
        boolean isExchangeabale = true;

        for (int i = 0; i < shorter.length(); i++)
        {
            if (!mappings.containsKey(word1.charAt(i)) && !mappings.containsValue(word2.charAt(i)))
            {
                mappings.put(word1.charAt(i), word2.charAt(i));
            }
            else
            {
                if (mappings.containsKey(word1.charAt(i)))
                {
                    if (mappings.get(word1.charAt(i)) != word2.charAt(i))
                    {
                        isExchangeabale = false;
                        return isExchangeabale;
                    }
                }
                else if (mappings.containsValue(word2.charAt(i)))
                {
                    isExchangeabale = false;
                    return isExchangeabale;
                }
            }
        }

        String remainingLetters = longer.substring(shorter.length());

        for (char letter : remainingLetters.toCharArray())
        {
            if (!mappings.containsKey(letter) && !mappings.containsValue(letter))
            {
                isExchangeabale = false;
                return isExchangeabale;
            }
        }

        return isExchangeabale;
    }
}
