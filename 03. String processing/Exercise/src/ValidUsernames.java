import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usernames = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<=[ /\\\\()]|^)[a-zA-Z][\\w]{2,24}(?=[ /\\\\()]|$)");
        Matcher matcher = pattern.matcher(usernames);

        List<String> names = new ArrayList<>();

        while (matcher.find()){
            names.add(matcher.group());
        }

        int index = 0;
        int sum = 0;

        for (int i = 0; i < names.size()-1; i++) {
            int tempSum = names.get(i).length() + names.get(i+1).length();

            if (tempSum > sum){
                sum = tempSum;
                index = i;
            }
        }

        System.out.println(names.get(index));
        System.out.println(names.get(index+1));
    }
}
