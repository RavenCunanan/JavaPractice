import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormat percentFormat = new DecimalFormat("+0.00%;-0.00%");

        // Base exchange rates
        double usdToRupees = 0.44;
        double usdToGil = 54.87;
        double usdToCoins = 2.23;

        // Random inflation range
        double min = -0.03;
        double max = 0.05;

        System.out.println("What's your $USD balance?");
        System.out.print(">> ");
        double usdAmount = scanner.nextDouble();

        // Generate random inflation for each currency
        double inflationRupees = min + (max - min) * random.nextDouble();
        double inflationGil = min + (max - min) * random.nextDouble();
        double inflationCoins = min + (max - min) * random.nextDouble();

        // Apply inflation-adjusted exchange rates
        double adjustedRupees = usdAmount * usdToRupees * (1 + inflationRupees);
        double adjustedGil = usdAmount * usdToGil * (1 + inflationGil);
        double adjustedCoins = usdAmount * usdToCoins * (1 + inflationCoins);

        // Output
        System.out.println("\nYour rates today are:");
        System.out.println("- - - - - - - - - - - - -");
        System.out.println("Rupees: " + df.format(adjustedRupees) +
            " (Rate change: " + percentFormat.format(inflationRupees) + ")");
        System.out.println("Gil: " + df.format(adjustedGil) +
            " (Rate change: " + percentFormat.format(inflationGil) + ")");
        System.out.println("Golden Coins: " + df.format(adjustedCoins) +
            " (Rate change: " + percentFormat.format(inflationCoins) + ")");
    }
}
