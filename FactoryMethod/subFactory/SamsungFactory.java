package FactoryMethod.subFactory;

import FactoryMethod.phone.Galaxy;
import FactoryMethod.phone.Phone;

public class SamsungFactory extends AbstractPhoneFactory{
    @Override
    public Phone createPhone() {
        return new Galaxy();
    }
}
