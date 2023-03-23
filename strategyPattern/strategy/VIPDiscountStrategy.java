package strategyPattern.strategy;

import strategyPattern.strategy.DiscountStrategy;

public class VIPDiscountStrategy implements DiscountStrategy {
    final double DISCOUNT_RATE = 0.3;

    @Override
    public int getDiscountedPrice(int price) {
        return (int) Math.max(0, price - (price * DISCOUNT_RATE));
    }

}
