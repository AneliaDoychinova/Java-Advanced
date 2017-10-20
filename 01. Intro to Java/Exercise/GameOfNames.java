import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        String winner = "";
        int maxPoints = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            String name = scanner.nextLine();
            int initialScore = Integer.parseInt(scanner.nextLine());
            int totalScore = initialScore;
            for (int j = 0; j < name.length(); j++) {
                int letter = name.charAt(j);
                if (letter%2 == 0){
                    totalScore += letter;
                }
                else{
                    totalScore -= letter;
                }
            }

            if (totalScore > maxPoints){
                maxPoints = totalScore;
                winner = name;
            }
        }

        System.out.printf("The winner is %s - %d points", winner, maxPoints);

    }
}
