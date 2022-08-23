package singleton;

public class Singleton1Basic {
    /*
    *   인스턴스를 클래스 내부 필드에서 생성
     * */
    private static volatile Singleton1Basic instance = new Singleton1Basic();

    /*  생성자를 private으로 봉인
     * */
    private Singleton1Basic() {}

    /*
     *   싱글톤은 글로벌로 접근이 가능해야 하므로 static
     *
     *   하지만 필드에서 생성해주면 사용하지 않아도 항상 메모리를 잡아먹는다는 단점이 존재한다.
     * */
    public static Singleton1Basic getSingleton() {
        return instance;
    }

    public static void main(String[] args) {
        /*
        *   매번 같은 인스턴스를 반환하는 클래스 생성 테스트!
        * */
        Singleton1Basic singleton1 = getSingleton();
        Singleton1Basic singleton2 = getSingleton();
        assert singleton1 == singleton2;
    }
}