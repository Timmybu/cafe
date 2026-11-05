public class CommitCafe {

    private static String barista = "Timbob";
    private static String barista_nick = "Head Hancho";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("Cup is brewing...");
        System.out.println("CoffeeBot brewed " + drink + ". Practicing Caffeine-Driven Development (CDD).");
        System.out.println("[BOT CHECK] drink length = " + drink.length());
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}