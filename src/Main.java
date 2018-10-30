
public class Main {

    public static void main(String[] args) {
        //initializing a blank card for a user with a standard discount for the card type and 0$ in previous month turnover
        DiscountCard c1 = new BronzeCard("Pera");
        //setting up the previous month turnover as a separate action (it calculates the new discount rate in the background)
        c1.setPreviousMonthTurnover(0);
        DiscountCard c2 = new SilverCard("Mika");
        c2.setPreviousMonthTurnover(600);
        DiscountCard c3 = new GoldCard("Laza");
        c3.setPreviousMonthTurnover(1500);

        // supplying calculateAndPrintPurchaseData method with the actual card and the purchase value
        // it will calculate and print out all of the data requested
        //(purchase value, discount rate, discount value, total purchase value)
        PayDesk.calculateAndPrintPurchaseData(c1, 150);
        System.out.println();
        PayDesk.calculateAndPrintPurchaseData(c2, 850);
        System.out.println();
        PayDesk.calculateAndPrintPurchaseData(c3, 1300);

    }
}
