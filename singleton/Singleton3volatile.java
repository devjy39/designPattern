package singleton;

public class Singleton3volatile {
    private static volatile Singleton3volatile instance;

    private Singleton3volatile() {}

    /*
    *   instance가 null일때만 synchrosize 처리를 해서 성능을 개선.
    *
    *   하지만 인스턴스를 스레드 cpu 캐시에서 생성하고 메모리에 쓰는시점과
    *   다른 스레드가 메모리의 인스턴스를 읽는 시점이 타이밍이 다르기 때문에 동기화문제가 발생함.
    *   volatile 키워드를 사용하면 cpu 캐시를 사용하지 않고 메모리로 바로 접근하기 때문에
    *   동기화를 해결할 수 있지만 또 속도에서 손해는 발생한다.
    * */

    public static Singleton3volatile getInstance() {
        if (instance == null) {
            synchronized (Singleton3volatile.class) {
                if (instance == null) {
                    instance = new Singleton3volatile();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        /*
         *   매번 같은 인스턴스를 반환하는 클래스 생성 테스트!
         * */
        Singleton3volatile singleton1 = Singleton3volatile.getInstance();
        Singleton3volatile singleton2 = Singleton3volatile.getInstance();
        assert singleton1 == singleton2;
    }
}
