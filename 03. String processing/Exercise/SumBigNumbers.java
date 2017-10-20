import com.sun.org.apache.regexp.internal.RE;

import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder firstNum = new StringBuilder(scanner.nextLine());
        StringBuilder secondNum = new StringBuilder(scanner.nextLine());

        if (firstNum.length() > secondNum.length()){
            int pad = firstNum.length()-secondNum.length();
            for (int i = 0; i < pad; i++) {
                secondNum.insert(i,'0');
            }
        }
        else if (secondNum.length() > firstNum.length()){
            int pad = secondNum.length()-firstNum.length();
            for (int i = 0; i < pad; i++) {
                firstNum.insert(i,'0');
            }
        }

        StringBuilder result = new StringBuilder();
        int remainder = 0;

        for (int i = firstNum.length()-1; i >=0 ; i--) {
            int n1 = Integer.parseInt(String.valueOf(firstNum.charAt(i)));
            int n2 = Integer.parseInt(String.valueOf(secondNum.charAt(i)));

            int number = (n1+n2+remainder);
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
