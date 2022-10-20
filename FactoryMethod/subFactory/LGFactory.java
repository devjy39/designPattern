package FactoryMethod.subFactory;

import FactoryMethod.phone.GPro;
import FactoryMethod.phone.Phone;

public class LGFactory extends AbstractPhoneFactory{
    @Override
    public Phone createPhone() {
        return new GPro();
    }
}
