
public class GoldCard extends DiscountCard {

    public GoldCard(String owner) {
        super(owner);
    }

    @Override
    public void calculateDiscountRate() {
        double temp = this.previousMonthTurnover;
        while (this.discountRate < MAXIMUM_DISCOUNT && temp > DOLLAR_UPGRADE_LIMIT) {
            temp = temp - DOLLAR_UPGRADE_LIMIT;
            this.discountRate++;
        }
    }

}
