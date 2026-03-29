import java.util.ArrayList;
import java.util.Scanner;

public class EcoTrackMain  {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        ArrayList<Activity> logs = new ArrayList<>();
        
        EcoTipThread tips = new EcoTipThread();
        tips.setDaemon(true);
        tips.start();

        System.out.println("=== ECOTRACK: SUSTAINABILITY ASSISTANT ===");
        
        while(true) {
            System.out.println("\n1. Log Car Travel (km)\n2. View Summary\n3. Exit");
            int choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("Enter distance in km: ");
                double km = sc.nextDouble();
                Transportation t = new Transportation(km);
                logs.add(t);
                DatabaseManager.saveToDB("Travel", t.calculateCO2());
            } else if(choice == 2) {
                double total = 0;
                for(Activity a : logs) total += a.calculateCO2();
                System.out.printf("Total Footprint: %.2f kg CO2\n", total);
            } else {
                break;
            }
        }
        System.out.println("Closing EcoTrack. Goodbye!");
    }
}
