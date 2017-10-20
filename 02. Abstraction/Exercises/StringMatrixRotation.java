import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotateDegrees = scanner.nextLine();
        int degrees = Integer.parseInt(rotateDegrees.substring(7, rotateDegrees.length()-1));
        degrees = degrees%360;

        List<String> list = new ArrayList<>();
        int maxLength = 0;

        while (true){
            String input = scanner.nextLine();
            if (input.equals("END")){
                break;
            }
            if (input.length()>maxLength){
                maxLength = input.length();
            }
            list.add(input);
        }
        int rows = list.size();
        int cols = maxLength;
        char[][] matrix = new char[rows][cols];

        fillTheMatrix(matrix, list, maxLength);
        rotateMatrix(matrix,degrees);
    }

    private static void fillTheMatrix(char[][] matrix, List<String> list, int maxLength) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j>=list.get(i).length()){
                    matrix[i][j] = ' ';
                }
                else {
                    matrix[i][j] = list.get(i).charAt(j);
                }
            }
        }
    }

    private static void rotateMatrix(char[][] matrix, int degrees) {
        switch (degrees){
            case 90:
                for (int col = 0; col < matrix[0].length; col++) {
                    for (int row = matrix.length-1; row >=0 ; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = matrix.length-1; row >=0 ; row--) {
                    for (int col = matrix[0].length-1; col >= 0 ; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = matrix[0].length-1; col >=0 ; col--) {
                    for (int row = 0; row < matrix.length ; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 0:
                for (int row = 0; row < matrix.length; row++) {
                    for (int col = 0; col < matrix[0].length; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;

                }
        }
    }
