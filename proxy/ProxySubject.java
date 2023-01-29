package proxy;

public class ProxySubject implements Subject {
    RealSubject realSubject;
    String cacheFilename;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public String getFile() {
        if (cacheFilename == null) {
            cacheFilename = realSubject.getFile();
        }

        System.out.println("프록시 객체 캐시 호출..");
        return cacheFilename;
    }
}
