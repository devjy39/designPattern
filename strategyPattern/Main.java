package strategyPattern;


/*
    전략 패턴은 결국 팩토리던 뭐던 분기문을 통해 전략을 선택하는 로직이 들어간다.
    하지만 클라이언트에는 어떤 전략이 선택된지 알 수 없고, 알 필요도 없이 캡슐화 시켜서 구현할 수 있다.

    결국 전략이 선택될 때 어딘가에는 분기문이나, 팩토리 아니면 DI로 프레임워크에서 주입이 이뤄져야 함.
* */
public class Main {
    public static void main(String[] args) {
        Product product = new Product("좋은 상품", 100_000);

        // 첫 방문 고객 50% 할인
        Customer firstCustomer = new Customer(0);
        firstCustomer.printBill(product);

        // 이제 2번째 방문인 고객의 상시할인 10%
        firstCustomer.printBill(product);

        // 100번 이상 방문 vip 할인 30%
        Customer VIPCustomer = new Customer(150);
        VIPCustomer.printBill(product);
    }
}
