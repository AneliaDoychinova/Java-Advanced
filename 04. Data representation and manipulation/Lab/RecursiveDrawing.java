import java.util.Collections;
import java.util.Scanner;

public class RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        drawing(n);
    }

    private static void drawing(int n) {
        if (n == 0){
            return;
        }

        System.out.println(String.join("", Collections.nCopies(n, "*")) );
        drawing(n-1);
        System.out.println(String.join("", Collections.nCopies(n, "#")) );
    }
}
