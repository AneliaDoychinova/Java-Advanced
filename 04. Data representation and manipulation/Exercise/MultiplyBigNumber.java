import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder firstNum = new StringBuilder(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        if (n2 ==0){
            System.out.println(0);
            return;
        }
        StringBuilder result = new StringBuilder();
        int remainder = 0;

        for (int i = firstNum.length()-1; i >=0 ; i--) {
            int n1 = Integer.parseInt(String.valueOf(firstNum.charAt(i)));

            int number = (n1*n2+remainder);
            int numToAppend = number%10;
            remainder = number/10;
            result.append(numToAppend);
        }
        if (remainder > 0){
            result.append(remainder);
        }
        result.reverse();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '0'){
                result.deleteCharAt(i);
                i--;
            }
            else{
                break;
            }

        }
        System.out.println(result);
    }
}
