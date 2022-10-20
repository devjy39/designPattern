package FactoryMethod.phone;

public enum Brand {
    SAMSUNG, LG, APPLE;

    public boolean isSamsung() {
        return this == SAMSUNG;
    }

    public boolean isLG() {
        return this == LG;
    }

    public boolean isAPPLE() {
        return this == APPLE;
    }
}
