package FactoryMethod.factory;

import FactoryMethod.phone.Brand;
import FactoryMethod.phone.Phone;

public class Main {
    /*
    *   하나의 팩토리에서 타입을 받아 각각의 구현체를 얻는 방식의 팩토리
    * */
    public static void main(String[] args) {
        //bean
        PhoneFactory factory = new PhoneFactory();

        service(factory);
    }

    private static void service(PhoneFactory factory) {
        Phone galaxy = factory.createPhone(Brand.SAMSUNG);
        galaxy.info();

        Phone iPhone = factory.createPhone(Brand.APPLE);
        iPhone.info();

        Phone gPro = factory.createPhone(Brand.LG);
        gPro.info();
    }
}
