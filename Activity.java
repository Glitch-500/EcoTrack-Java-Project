public abstract class Activity {
    protected String name;
    protected double quantity;

    public Activity(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public abstract double calculateCO2(); 
    
    public String getName() { return name; }
}