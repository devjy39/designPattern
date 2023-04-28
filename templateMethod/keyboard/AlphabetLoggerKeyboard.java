package templateMethod.keyboard;

public class AlphabetLoggerKeyboard extends KeyBoard {
    @Override
    public void keyUp(String key) {
        System.out.println("key up logging... " + key);
    }

    @Override
    public void keyDown(String key) {
        System.out.println("key down logging... " + key);
    }
}
