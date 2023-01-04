package decorator.object;

public class Americano extends BeverageDecorator {

    public Americano(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String getName() {
        return "아메리카노";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 500;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", 물";
    }
}
