
public class SilverCard extends DiscountCard {

    public SilverCard(String owner) {
        super(owner);
    }

    @Override
    public void calculateDiscountRate() {
        if (this.previousMonthTurnover > UPPER_BOUND) {
            this.discountRate = 3.5;
        }
    }

}
