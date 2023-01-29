package proxy;

/*
*   proxy 패턴의 접근 제어를 사용해보자.
*   ProxySubject는 실제 객체의 참조를 가지고 있어야 한다.
*   내부 함수는 캐싱된 값이 있으면 리턴하고 없을 때만 호출을 하고 있다.
*
*   다음의 결과는 처음에만 로딩이 되고 나머지는 캐시값을 바로 호출한다.
*
*   자칫 캐싱기능을 추가했으니 데코레이터 아닌가라고 생각할 수도 있지만
*   객체의 접근 제어에 기반한 기능이기 때문에 미묘한 의도(intent) 차이가 있다.
* */
public class Main {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject("example_file_name");
        Subject subject = new ProxySubject(realSubject);

        System.out.println("file name : " + subject.getFile());
        System.out.println("file name : " + subject.getFile());
        System.out.println("file name : " + subject.getFile());
    }
}
