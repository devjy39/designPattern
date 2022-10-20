package FactoryMethod.phone;

public interface Phone {
    default void info() {
        System.out.println(this.getClass().getSimpleName());
    }
}
