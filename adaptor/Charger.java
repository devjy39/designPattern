package adaptor;

import adaptor.cable.UsbCable;

public class Charger {
    public void chargeUsb(UsbCable device) {
        System.out.println("Charger : " + device.getUsbConnectedDeviceName() + "을 USB 로 충전중......");
    }
}
