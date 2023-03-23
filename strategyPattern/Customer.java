package strategyPattern;

import strategyPattern.strategy.DiscountStrategy;

public class Customer {
    private int visitedCount;
    private DiscountStrategy discountStrategy;

    /*
        팩토리를 이용해서 주입되는 할인전략
    * */
    public Customer(int visitedCount) {
        this.visitedCount = visitedCount;
        this.discountStrategy = DiscountStrategyFactory.getDiscountStrategy(this.visitedCount);
    }

    public int getVisitedCount() {
        return visitedCount;
    }

    public void printBill(Product product) {
        System.out.printf("%s : %d 원. (할인 전략 : %s)\n", product.getName(), discountStrategy.getDiscountedPrice(product.getPrice()),
                discountStrategy.getClass().getSimpleName());

        visitedCount++;
        this.discountStrategy = DiscountStrategyFactory.getDiscountStrategy(visitedCount);
    }
}
