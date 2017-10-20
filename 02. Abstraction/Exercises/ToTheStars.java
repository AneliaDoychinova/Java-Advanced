import java.util.Scanner;

public class ToTheStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstStar = scanner.nextLine().split(" ");
        String firstStarName = firstStar[0];
        double firstStarCol = Double.parseDouble(firstStar[1]);
        double firstStarRow = Double.parseDouble(firstStar[2]);

        String[] secondStar = scanner.nextLine().split(" ");
        String secondStarName = secondStar[0];
        double secondStarCol = Double.parseDouble(secondStar[1]);
        double secondStarRow = Double.parseDouble(secondStar[2]);

        String[] thirdStar = scanner.nextLine().split(" ");
        String thirdStarName = thirdStar[0];
        double thirdStarCol = Double.parseDouble(thirdStar[1]);
        double thirdStarRow = Double.parseDouble(thirdStar[2]);

        double NormandyCol = scanner.nextDouble();
        double NormandyRow = scanner.nextDouble();
        scanner.nextLine();

        int turns = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= turns; i++) {
            if (Math.abs(NormandyCol-firstStarCol)<=1 && Math.abs(NormandyRow - firstStarRow)<=1){
                System.out.println(firstStarName.toLowerCase());
            }
            else if (Math.abs(NormandyCol-secondStarCol) <= 1 && Math.abs(NormandyRow - secondStarRow) <= 1){
                System.out.println(secondStarName.toLowerCase());
            }
            else if (Math.abs(NormandyCol-thirdStarCol)<=1 && Math.abs(NormandyRow - thirdStarRow)<=1){
                System.out.println(thirdStarName.toLowerCase());
            }
            else{
                System.out.println("space");
            }

            NormandyRow++;
        }
    }
}
