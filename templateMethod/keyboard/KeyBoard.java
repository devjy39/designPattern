package templateMethod.keyboard;

public abstract class KeyBoard {
    /*
    *   반복되는 로직이 구현된 template method!
    *
    *   허나, template 로직들이 변경될 여지가 생긴다면 문제가 된다.
    *   예를들어 esc가 들어왔을 때는 뒤의로직들이 동작을 안해야 한다는 변경이 생긴다면
    *   템플릿메서드 자체를 수정해야하는 문제가 생기고 유지보수성이 떨어짐.
    * */
    public void press(String key) {

//        if ("ESC".equals(key)) {  // 예기치 못한 변경사항
//            System.out.println("esc logging.. 종료");
//            return;
//        }

        keyDown(key);
        System.out.println("입력된 key : " + key);
        keyUp(key);

        System.out.println();
    }


    /*
    *   세부 로직 구현은 하위 클래스에게 맡김.
    * */
    public abstract void keyUp(String key);
    public abstract void keyDown(String key);
}
