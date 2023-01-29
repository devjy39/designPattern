package proxy;

public class RealSubject implements Subject{
    private final String filename;

    public RealSubject(String filename) {
        this.filename = filename;
    }

    @Override
    public String getFile() {
        System.out.println("파일을 가져오기 loading...");
        return filename;
    }
}
