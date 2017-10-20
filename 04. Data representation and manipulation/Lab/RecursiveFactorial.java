import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(factorial(num));
    }

    private static long factorial(int num) {
        if (num == 0){
            return 1;
        }
        if (num == 1){
            return num;
        }
        return num * factorial(num-1);
    }

}
