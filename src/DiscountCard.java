
public abstract class DiscountCard {

    protected static final double MAXIMUM_DISCOUNT = 10;
    protected static final double BRONZE_INITIAL_DISCOUNT = 0;
    protected static final double SILVER_INITIAL_DISCOUNT = 2;
    protected static final double GOLD_INITIAL_DISCOUNT = 2;
    protected static final double LOWER_BOUND = 100;
    protected static final double UPPER_BOUND = 300;
    protected static final double DOLLAR_UPGRADE_LIMIT = 100;

    private String owner;
    protected double previousMonthTurnover;
    protected double discountRate;

    // a 'blank' constructor - simulating registering a fresh new card
    public DiscountCard(String owner) {
        this.owner = owner;
        this.previousMonthTurnover = 0;
        // initial discount rate will depend on the type of card so we can separate the logic for determining that in a separate method
        setInitialDiscountRate();
    }

    // this setter for the previousMonthTurnover will also calculate the discount rate for the given card type
    public void setPreviousMonthTurnover(double previousMonthTurnover) {
        this.previousMonthTurnover = previousMonthTurnover;
        calculateDiscountRate();
    }

    // implementation of this method will depend on the given card type
    public abstract void calculateDiscountRate();

    private void setInitialDiscountRate() {
        if (this instanceof BronzeCard) {
            this.discountRate = BRONZE_INITIAL_DISCOUNT;
        } else if (this instanceof SilverCard) {
            this.discountRate = SILVER_INITIAL_DISCOUNT;
        } else {
            this.discountRate = GOLD_INITIAL_DISCOUNT;
        }
    }

}
