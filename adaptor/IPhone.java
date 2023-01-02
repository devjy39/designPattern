package adaptor;

import adaptor.cable.EightPinCable;

public class IPhone implements EightPinCable {
    @Override
    public String getEightPinConnectedDeviceName() {
        return getClass().getSimpleName();
    }
}
