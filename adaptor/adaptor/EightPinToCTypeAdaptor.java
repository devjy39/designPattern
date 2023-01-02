package adaptor.adaptor;

import adaptor.cable.CTypeCable;
import adaptor.cable.EightPinCable;

public class EightPinToCTypeAdaptor implements CTypeCable {
    private final EightPinCable eightPinConnector;
    public EightPinToCTypeAdaptor(EightPinCable eightPinConnector) {
        this.eightPinConnector = eightPinConnector;
    }

    @Override
    public String getCTypeConnectedDeviceName() {
        return this.eightPinConnector.getEightPinConnectedDeviceName();
    }
}
