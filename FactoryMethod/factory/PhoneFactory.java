package FactoryMethod.factory;

import FactoryMethod.phone.*;

public class PhoneFactory {
    // type 별로 다른 객체를 생성해주는 factory
    public Phone createPhone(Brand brand) {
        if (brand.isSamsung()) {
            return new Galaxy();
        }

        if (brand.isAPPLE()) {
            return new IPhone();
        }

        if (brand.isLG()) {
            return new GPro();
        }

        throw new RuntimeException("브랜드가 정의되지 않았습니다.");
    }
}
