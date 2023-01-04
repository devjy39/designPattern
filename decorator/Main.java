package decorator;

import decorator.object.*;

/*
*   데코레이터 패턴
*   기존 객체를 수정 없이 새로운 책임을 추가하고 싶을 때
*   이 객체를 사용하는 클라이언트에 코드의 변경 없이 책임을 추가할 수 있다.
*   단일 책임 원칙 을 준수하는데 유용하다.
*
*   원래 클래스를 감싸는 새로운 Decorator 클래스를 설계함으로써 기존 클래스에 변경 없이
*   기능을 유연하게 확장(장식)할 수 있다. 이 패턴은 재정의된 메서드에 새 기능을 추가할 때마다
*   여러 데코레이터를 서로 쌓을 수 있도록 설계되어있다.
*
*
*   기존 음료(espresso)를 수정하지 않고 데코레이터를 사용해서 새로운 음료(americano,caffeLatte,caffeMocha)를 만들었다.
*   에스프레소의 가격을 올릴 경우 에스프레스가 포함된 음료 모두 가격이 오른다.
*
*   출력 결과:
    에스프레소의 가격은 1000원, 재료 : 에스프레소
    아메리카노의 가격은 1500원, 재료 : 에스프레소, 물
    카페라떼의   가격은 2000원, 재료 : 에스프레소, 우유
    카페모카의   가격은 2700원, 재료 : 에스프레소, 우유, 초코시럽
* */
public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso.printInformation();

        Beverage americano = new Americano(espresso);
        americano.printInformation();

        Beverage caffeLatte = new CaffeLatte(espresso);
        caffeLatte.printInformation();

        Beverage caffeMocha = new CaffeMocha(caffeLatte, 700);
        caffeMocha.printInformation();
    }
}
