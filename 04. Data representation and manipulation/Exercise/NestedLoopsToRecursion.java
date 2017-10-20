import java.util.Arrays;
import java.util.Scanner;

public class NestedLoopsToRecursion {
    public static int numberOfLoops;
    public static int numberOfIterations;
    public static int[] loops;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        numberOfLoops = scanner.nextInt();
        numberOfIterations = numberOfLoops;
        scanner.nextLine();

        loops = new int[numberOfLoops];

        simulateLoops(0);

    }

    private static void simulateLoops(int current) {

        if (current == numberOfLoops){
            printLoop();
            return;
        }

        for (int i = 1; i <=numberOfIterations ; i++) {
            loops[current] = i;
            simulateLoops(current+1);
        }
    }

    private static void printLoop() {
        System.out.println(Arrays.toString(loops).replaceAll("[]\\[,]", ""));
    }
}
