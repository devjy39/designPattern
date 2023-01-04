package decorator.object;

public class CaffeLatte extends BeverageDecorator {
    public CaffeLatte(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String getName() {
        return "카페라떼";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1000;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", 우유";
    }
}
