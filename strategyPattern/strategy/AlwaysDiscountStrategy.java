package strategyPattern.strategy;

public class AlwaysDiscountStrategy implements DiscountStrategy {
    final double DISCOUNT_RATE = 0.1;

    @Override
    public int getDiscountedPrice(int price) {
        return (int) Math.max(0, price - (price * DISCOUNT_RATE));
    }
}
