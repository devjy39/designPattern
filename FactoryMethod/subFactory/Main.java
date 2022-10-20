package FactoryMethod.subFactory;

import FactoryMethod.phone.Phone;

public class Main {

    /*
    *   팩토리 자체가 여러 개로 나뉘어 타입을 주지 않고도 원하는 클래스를 제공해주는 팩토리
    *   스프링에서는 빈 DI 방식을 사용하기 때문에 이 방식이 좀 더 유용해보인다.
    * */

    public static void main(String[] args) {
        AbstractPhoneFactory samsungFactory = new SamsungFactory();
        Phone galaxy = samsungFactory.createPhone();
        galaxy.info();

        AbstractPhoneFactory appleFactory = new AppleFactory();
        Phone iPhone = appleFactory.createPhone();
        iPhone.info();

        AbstractPhoneFactory lgFactory = new LGFactory();
        Phone gPro = lgFactory.createPhone();
        gPro.info();
    }
}
