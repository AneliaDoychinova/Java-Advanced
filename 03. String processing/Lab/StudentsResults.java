import java.util.Scanner;

public class StudentsResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String heading = String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average");

            String name = scanner.next();
            String dash = scanner.next();
            String[] input = scanner.nextLine().split(", ");
            double jAdv = Double.parseDouble(input[0]);
            double javaOOP = Double.parseDouble(input[1]);
            double advOOP = Double.parseDouble(input[2]);
            double avg = (jAdv + javaOOP + advOOP)/3;

            String output = String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", name, jAdv, javaOOP, advOOP, avg);

        System.out.println(heading);
        System.out.println(output);
    }
}
