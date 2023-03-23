package strategyPattern.strategy;

public class FirstVisitedStrategy implements DiscountStrategy{
    final double DISCOUNT_RATE = 0.5;

    @Override
    public int getDiscountedPrice(int price) {
        return (int) Math.max(0, price - (price * DISCOUNT_RATE));
    }

}
