
public class PayDesk {

    // though a method should ideally only be limited to doing one and only one thing
    // the calculation performed is pretty straightforward so the method maintains it's elegance
    public static void calculateAndPrintPurchaseData(DiscountCard card, double purchaseValue) {

        double discountRate = card.discountRate;
        double discountValue = discountRate / 100 * purchaseValue;
        double totalPurchaseValue = purchaseValue - discountValue;

        printPurchaseValue(purchaseValue);
        printDiscountRate(discountRate);
        printDiscountValue(discountValue);
        printTotalPurchaseValue(totalPurchaseValue);
    }

    // 4 private methods for separately printing out every point of interest 
    private static void printPurchaseValue(double purchaseValue) {
        System.out.println(String.format("Purchase value: $%.2f", purchaseValue));
    }

    private static void printDiscountRate(double discountRate) {
        System.out.println(String.format("Discount rate: %.1f%%", discountRate));
    }

    private static void printDiscountValue(double discountValue) {
        System.out.println(String.format("Discount value: $%.2f", discountValue));
    }

    private static void printTotalPurchaseValue(double totalPurchaseValue) {
        System.out.println(String.format("Total purchase value: $%.2f", totalPurchaseValue));
    }

}
