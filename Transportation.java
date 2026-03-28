public class Transportation extends Activity {
    public Transportation(double km) {
        super("Car Travel", km);
    }

    @Override
    public double calculateCO2() {
        return quantity * 0.21; // 0.21kg CO2 per km
    }
}