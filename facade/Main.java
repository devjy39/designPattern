package facade;

import facade.Object.*;

/*
*   facade = 전면 또는 외부를 의미하는 프랑스 용어에서 차용.
*
*   복잡한 서브시스템에 인터페이스를 단순하게 구성하고자 할 때
*   시스템간 결합도를 줄이고자 할 때
*   서브시스템을 계층화 시키고 싶을 때
*
*   간단하게 생각하면, 복잡한 로직을 캡슐화하여 인터페이스로 제공해 주는것이다.
* */
public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        // 컴퓨터 속 많은 하드웨어 객체들 간의 복잡한 로직인 부팅과정을
        // 컴퓨터객체의 start 메소드 하나로 캡슐화하여 facade 패턴을 적용.
    }
}
