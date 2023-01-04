package decorator.object;

abstract class BeverageDecorator implements Beverage{
    public final Beverage decoratedBeverage; // 데코레이터

    protected BeverageDecorator(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    @Override
    public String getName() {
        return decoratedBeverage.getName();
    }

    @Override
    public int getPrice() {
        return decoratedBeverage.getPrice();
    }

    @Override
    public String getIngredients() {
        return decoratedBeverage.getIngredients();
    }
}
