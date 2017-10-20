import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        boolean hasMatch = false;
        List matches = new ArrayList<String>();

        while (!username.equals("END")){
            Pattern pattern = Pattern.compile("^[\\w-]{3,16}$");
            Matcher matcher = pattern.matcher(username);

            if (matcher.find()){
                matches.add("valid");
                hasMatch = true;
            }
            else{
                matches.add("invalid");
            }

            username = scanner.nextLine();
        }
        if (hasMatch) {
            for (int i = 0; i < matches.size(); i++) {
                System.out.println(matches.get(i));
            }
        }
    }
}
