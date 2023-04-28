package templateMethod;

import templateMethod.keyboard.AlphabetLoggerKeyboard;
import templateMethod.keyboard.ESCLoggingKeyBoard;
import templateMethod.keyboard.KeyBoard;

public class Main {

    /*
    *   AlphabetLoggerKeyboard 는 상위 abstract class인 keyboard의 press() 에서 사용하는
    *   keydown(), keyup() 의 세부 내용만을 구현한 구현체이다.
    * */
    public static void main(String[] args) {
        KeyBoard keyBoard = new AlphabetLoggerKeyboard();
        //keyBoard keyBoard = new ESCLoggingKeyBoard();

        keyBoard.press("A");
        keyBoard.press("B");
        keyBoard.press("C");
    }
}
