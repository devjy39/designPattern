package singleton;

public class Singleton4Holder {
    private static Singleton4Holder instance = null;

    private Singleton4Holder() {}

    /*
     *   내부에 인스턴스 홀더 생성 - 지연된 초기화 방식
     *   홀더가 내부의 내부 변수로 밖의 클래스를 의존한다.
     *
     *   보통 static class는 클래스 로딩시점에 한 번만 호출되는데
     *   이렇게 내부에 static class를 선언하면 그렇지 않고 실제로 사용하는 시점에 로딩이된다.
     *   바로 getInstance를 호출했을 때!
     *   이렇게 하면 jvm 레벨에서 클래스 로더는 클래스를 하나씩 읽어오기 때문에
     *   싱글톤을 jvm레벨에서 보장해주기 때문에 동기화 걱정을 할필요가 없다.
     * */
    private static class SingletonHolder {
        private static final Singleton4Holder instance = new Singleton4Holder();
    }

    public static Singleton4Holder getInstance() {
        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        /*
         *   매번 같은 인스턴스를 반환하는 클래스 생성 테스트!
         * */
        Singleton4Holder singleton1 = Singleton4Holder.getInstance();
        Singleton4Holder singleton2 = Singleton4Holder.getInstance();
        assert singleton1 == singleton2;
    }
}
