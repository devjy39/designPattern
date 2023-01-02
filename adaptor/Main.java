package adaptor;

import adaptor.adaptor.CTypeToUsbAdaptor;
import adaptor.adaptor.EightPinToCTypeAdaptor;

/*
*   서로 다른 시스템, 인터페이스 등을 함께 동작(연결)하고자 할 때 ( 실제 어댑터의 역할 )
*   기대하는 다른 인터페이스로 변환하는 패턴
*
*   해결할 수 있는 문제:
*   클라이언트에 필요한 인터페이스가 없는 클래스를 재사용할 수 있다.
*   호환되지 않는 인터페이스가 있는 클래스를 작동시킬 수 있다.
*   클래스에 대한 대체 인터페이스를 제공해줄 수 있다.
*
*   핵심 아이디어:
*   adapter(이미 존재하는) 클래스의 인터페이스를 변경하지 않고 별도의 작업을 수행하는 것
* */
public class Main {
    public static void main(String[] args) {
        PortablePan portablePan = new PortablePan();
        MacBook macBook = new MacBook();
        IPhone iPhone = new IPhone();

        Charger charger = new Charger();
        charger.chargeUsb(portablePan);
        charger.chargeUsb(new CTypeToUsbAdaptor(macBook));
        // c type -> usb 어댑터 적용
        charger.chargeUsb(new CTypeToUsbAdaptor(new EightPinToCTypeAdaptor(iPhone)));
        // 8pin -> c type -> usb 어댑터 적용
    }
}
