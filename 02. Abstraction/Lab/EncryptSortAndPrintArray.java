import java.util.*;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numfOfStrings = Integer.parseInt(scanner.nextLine());

        String[] names = new String[numfOfStrings];

        List<Character> vowels = new ArrayList<Character>();
        Collections.addAll(vowels,'a','o','u','e','i','A','O','U','E','I');

        int[] result = new int[numfOfStrings];

        for (int i = 0; i < numfOfStrings; i++) {

            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < names.length ; i++) {

            int sum = 0;

            for (int j = 0; j < names[i].length(); j++) {
                char letter = names[i].charAt(j);
                int stringLenght = names[i].length();

                if (vowels.contains(letter)){
                    sum+= letter * stringLenght;
                }
                else{
                    sum+= letter/stringLenght;
                }
            }

            result[i] = sum;
        }

        Arrays.sort(result);
        printArray(result);
    }

    private static void printArray(int[] result) {

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
