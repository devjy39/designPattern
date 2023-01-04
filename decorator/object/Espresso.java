package decorator.object;

public class Espresso implements Beverage {

    @Override
    public String getName() {
        return "에스프레소";
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getIngredients() {
        return "에스프레소";
    }
}
