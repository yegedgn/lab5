import java.util.Random;
import java.text.DecimalFormat;

public class Main9 {
    public static void main(String[] args) {
        final int DAYS = 1_000_000;
        Random rand = new Random();



        String[] weatherPool = new String[10];
    
        for (int i = 0; i < 4; i++) weatherPool[i] = "Sunny";

        for (int i = 4; i < 7; i++) weatherPool[i] = "Cloudy";

        for (int i = 7; i < 9; i++) weatherPool[i] = "Rainy";

        weatherPool[9] = "Stormy";


        int sunnyCount = 0, cloudyCount = 0, rainyCount = 0, stormyCount = 0;


        for (int i = 0; i < DAYS; i++) {
            int index = rand.nextInt(weatherPool.length);
            String weather = weatherPool[index];

            switch (weather) {
                case "Sunny": sunnyCount++; break;
                case "Cloudy": cloudyCount++; break;
                case "Rainy": rainyCount++; break;
                case "Stormy": stormyCount++; break;
            }
        }


        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Weather Simulation Results (" + DAYS + " days):\n");
        System.out.println("Sunny:  " + sunnyCount + " (" + df.format(100.0 * sunnyCount / DAYS) + "%)");
        System.out.println("Cloudy: " + cloudyCount + " (" + df.format(100.0 * cloudyCount / DAYS) + "%)");
        System.out.println("Rainy:  " + rainyCount + " (" + df.format(100.0 * rainyCount / DAYS) + "%)");
        System.out.println("Stormy: " + stormyCount + " (" + df.format(100.0 * stormyCount / DAYS) + "%)");
    }
}
