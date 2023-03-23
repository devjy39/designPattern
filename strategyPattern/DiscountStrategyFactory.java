package strategyPattern;

import strategyPattern.strategy.AlwaysDiscountStrategy;
import strategyPattern.strategy.DiscountStrategy;
import strategyPattern.strategy.FirstVisitedStrategy;
import strategyPattern.strategy.VIPDiscountStrategy;

public class DiscountStrategyFactory {
    public static DiscountStrategy getDiscountStrategy(int visitedCount) {
        if (visitedCount == 0) {
            return new FirstVisitedStrategy();
        }

        if (visitedCount > 100) {
            return new VIPDiscountStrategy();
        }

        // 상시할인
        return new AlwaysDiscountStrategy();
    }
}
