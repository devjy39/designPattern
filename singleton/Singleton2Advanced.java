package singleton;

public class Singleton2Advanced {
    private static Singleton2Advanced instance;

    private Singleton2Advanced() {}

    /*
    *   싱글톤 인스턴스 생성을 늦춰서 메모리를 효율적으로 가져가는 개선방식
    *   instance를 호출한 시점에 메모리에 올라간다.
    *   하지만 또 thread safe하지 않다는 단점이 있음!
    *  2개의 쓰레드가 동시에 접근했을 때 null을 마주친다면 인스턴스는 2개를 생성할것이다.
    *
    *   간단하게 메서드에 synchrosize를 붙여서 해결할 수 있다.
    *   하지만 인스턴스를 호출할 때마다 동기화를 하기 때문에 엄청 느려짐
    * */

    public static synchronized Singleton2Advanced getInstance() {
        if (instance == null) {
            instance = new Singleton2Advanced();
        }
        return instance;
    }

    public static void main(String[] args) {
        /*
         *   매번 같은 인스턴스를 반환하는 클래스 생성 테스트!
         * */
        Singleton2Advanced singleton1 = Singleton2Advanced.getInstance();
        Singleton2Advanced singleton2 = Singleton2Advanced.getInstance();
        assert singleton1 == singleton2;
    }
}
