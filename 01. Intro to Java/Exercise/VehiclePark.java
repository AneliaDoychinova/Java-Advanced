import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List vehicles = new ArrayList();
        vehicles.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));

        String[] request = scanner.nextLine().split(" ");
        int sold = 0;

        while (!request[0].equals("End")){
            char type = Character.toLowerCase(request[0].charAt(0));
            int seats = Integer.parseInt(request[2]);

           if (vehicles.contains(type+""+seats)){
               System.out.printf("Yes, sold for %d$\n", type * seats);
               vehicles.remove(type + "" + seats);
               sold++;
            }
            else {
                System.out.println("No");
            }
            request = scanner.nextLine().split(" ");
        }
        System.out.println("Vehicles left: " + Arrays.toString(vehicles.toArray()).replace("[","").replace("]", ""));
        System.out.printf("Vehicles sold: %d%n",sold);
    }
}
