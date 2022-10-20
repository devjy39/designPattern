package FactoryMethod.subFactory;

import FactoryMethod.phone.IPhone;
import FactoryMethod.phone.Phone;

public class AppleFactory extends AbstractPhoneFactory{
    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
