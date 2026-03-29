public class EcoTipThread extends Thread {
    public void run() {
        String[] tips = {"Switch to LEDs!", "Unplug idle electronics.", "Walk for short distances."};
        try {
            while (true) {
                System.out.println("\n[TIP]: " + tips[(int)(Math.random()*3)]);
                Thread.sleep(15000); // Shows a tip every 15 seconds
            }
        } catch (InterruptedException e) {  }
    } 
}
