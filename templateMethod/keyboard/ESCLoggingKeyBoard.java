package templateMethod.keyboard;

public class ESCLoggingKeyBoard extends KeyBoard{
    @Override
    public void keyUp(String key) {
        System.out.println("key up logging... " + key);
    }

    @Override
    public void keyDown(String key) {
        System.out.println("key up logging... " + key);
    }

    /*
    *   추가된 다른 기능
    *   ESC라면 Teamplate method의 뒤 로직 동작을 멈춰야 한다면? -> 상위 로직 변경 필요..
    * */
    public boolean isESC(String key) {
        return "ESC".equals(key);
    }
}
