
public class DatabaseManager {
    public static void saveToDB(String type, double impact) {
        System.out.println("Connecting to database...");
        System.out.println("Data Successfully Synced to MySQL: " + type + " - " + impact + "kg");
    }
} 
