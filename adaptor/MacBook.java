package adaptor;

import adaptor.cable.CTypeCable;

public class MacBook implements CTypeCable {
    @Override
    public String getCTypeConnectedDeviceName() {
        return getClass().getSimpleName();
    }
}
