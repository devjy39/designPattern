package adaptor.adaptor;

import adaptor.cable.CTypeCable;
import adaptor.cable.UsbCable;

public class CTypeToUsbAdaptor implements UsbCable {
    private final CTypeCable cTypeConnector;
    public CTypeToUsbAdaptor(CTypeCable cTypeConnector) {
        this.cTypeConnector = cTypeConnector;
    }

    @Override
    public String getUsbConnectedDeviceName() {
        return cTypeConnector.getCTypeConnectedDeviceName();
    }
}
