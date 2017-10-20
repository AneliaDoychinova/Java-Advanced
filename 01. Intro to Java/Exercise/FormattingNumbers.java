import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String aHexadecimal = Integer.toHexString(a).toUpperCase();
        String aBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
        String bFormat = String.format("%.2f", b);
        String cFormat = String.format("%.3f", c);

        String hexIntervals = new String(new char[10 - aHexadecimal.length()]).replace("\0", " ");
        String bIntervals = new String(new char[10 - bFormat.length()]).replace("\0", " ");
        String cIntervals = new String(new char[10 - cFormat.length()]).replace("\0", " ");

        System.out.println("|" + aHexadecimal + hexIntervals + "|" + aBinary + "|" + bIntervals + bFormat + "|" +
        cFormat + cIntervals + "|");
    }
}
