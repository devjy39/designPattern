package adaptor;

import adaptor.cable.UsbCable;

public class PortablePan implements UsbCable {
    @Override
    public String getUsbConnectedDeviceName() {
        return getClass().getSimpleName();
    }
}
