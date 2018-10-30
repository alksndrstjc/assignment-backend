
public class BronzeCard extends DiscountCard {

    public BronzeCard(String owner) {
        super(owner);
    }

    @Override
    public void calculateDiscountRate() {
        if (this.previousMonthTurnover > LOWER_BOUND && this.previousMonthTurnover < UPPER_BOUND) {
            this.discountRate = 1;
        } else if (this.previousMonthTurnover > UPPER_BOUND) {
            this.discountRate = 2.5;
        }
    }

}
