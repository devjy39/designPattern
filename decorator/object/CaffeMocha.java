package decorator.object;

public class CaffeMocha extends BeverageDecorator {
    private final int syrupPrice;
    public CaffeMocha(Beverage decoratedBeverage, int syrupPrice) {
        super(decoratedBeverage);
        this.syrupPrice = syrupPrice;
    }

    @Override
    public String getName() {
        return "카페모카";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + syrupPrice;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", 초코시럽";
    }
}
