# designPattern

- 특정 문맥에서 **공통적으로 발생하는 문제**에 대한 **재사용 가능한 해결책**
- SW를 디자인할 때 **공통적이고 반복된 문제**들을 해결하는데 쓰이는 형식화된 좋은 **관행**!
- 항상 적용할 필요는 없고 사례를 참고하는 게 좋다.
    - 모범사례를 통해 시야확장
    - 유연한 설계를 지닌 객체지향의 장점
    - 디자인 패턴의 이름으로된 클래스들이 이미 다수 존재한다.
        - 코드를 이해하기 위해 필요

## GoF(gang of four) 디자인 패턴 구분

- 생성패턴
    - 객체 생성 혹은 조합에 관한 패턴
- 구조패턴
    - 객체를 조합해 더 큰 구조를 만드는 패턴
    - 새로운 기능을 추가하는데 관련된 패턴
- 행위패턴
    - 객체 사이 책임분배나 커뮤니케이션에 관한 패턴
    - 단일 객체가 처리해야될 일을 여러 객체로 나눌 때 어떻게 배분하면서 결합도를 낮출지
    

## 1. Singleton - 해결하려는 문제

- 클래스의 인스턴스가 1개임을 보장하고 싶다.
- 인스턴스 생성을 제어할수 있어야함.
- 1개뿐인 인스턴스에 쉽게 접근할 수 있어야함(글로벌 객체)