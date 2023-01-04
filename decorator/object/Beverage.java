package decorator.object;

public interface Beverage {
    String getName();
    int getPrice();

    String getIngredients();

    default void printInformation(){
        System.out.println(getName()+"의 가격은 "+getPrice()+"원, 재료 : " + getIngredients());
    }

}
