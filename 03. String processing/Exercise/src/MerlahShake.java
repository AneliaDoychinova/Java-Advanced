import java.util.Scanner;

public class MerlahShake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        StringBuilder target = new StringBuilder(scanner.nextLine());

        while (true){
            int firstIndex = input.indexOf(target.toString());
            int lastIndex = input.lastIndexOf(target.toString());

            if (firstIndex == -1 || lastIndex == -1 || "".equals(target.toString())){
                System.out.println("No shake.");
                break;
            }

            input = input.replace(firstIndex, firstIndex+target.length(), "");
            lastIndex = input.lastIndexOf(target.toString());
            input = input.replace(lastIndex, lastIndex+target.length(), "");

            int index = target.length()/2;

            target = target.deleteCharAt(index);

            System.out.println("Shaked it.");
        }

        System.out.println(input);
    }
}
