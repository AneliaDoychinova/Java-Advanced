import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractHyperlinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();

        Pattern pattern = Pattern.compile("<a\\s+([^>]+)?href\\s*=\\s*('([^']*)'|(\"([^\"]*)\")|([^\\s>]+))");

        String line = scanner.nextLine();

        while (!line.equals("END")){
            text.append(line);

            line = scanner.nextLine();
        }

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            for (int i = 5; i >= 0 ; i--) {
                String result = matcher.group(i);
                if (result != null){
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}
