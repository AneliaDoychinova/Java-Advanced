import java.util.Scanner;

public class TerroristsWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());

        int index = text.indexOf("|");
        int nextIndex = text.indexOf("|", index+1);

        while(index != -1){
            char[] bomb = text.substring(index+1, nextIndex).toCharArray();
            int bombPower = 0;

            for (int i = 0; i < bomb.length; i++) {
                bombPower += bomb[i];
            }
            bombPower = bombPower%10;
            int startDestroy = index-bombPower;
            int endDestroy = nextIndex + bombPower;

            for (int i = Math.max(startDestroy,0); i < Math.min(endDestroy+1,text.length()); i++) {
                text.replace(i,i+1,".");
            }

            index = text.indexOf("|");
            nextIndex = text.indexOf("|", index+1);
        }
        System.out.println(text);

    }
}
