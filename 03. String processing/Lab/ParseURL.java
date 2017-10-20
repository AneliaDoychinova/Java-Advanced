import javax.print.DocFlavor;
import java.util.Scanner;

public class ParseURL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();

        String[] protocolSplit = url.split("://");
        if (protocolSplit.length > 2){
            System.out.println("Invalid URL");
            return;
        }
        String protocol = protocolSplit[0];

        try{
        int index = protocolSplit[1].indexOf("/");

        String server = protocolSplit[1].substring(0,index);
        String resources = protocolSplit[1].substring(server.length()+1);
        System.out.printf("Protocol = %s%n", protocol);
        System.out.printf("Server = %s%n", server);
        System.out.printf("Resources = %s%n", resources);
        }
        catch (Exception ex){
            System.out.println("Invalid URL");
        }
    }
}
