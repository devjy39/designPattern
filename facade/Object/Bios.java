package facade.Object;

public class Bios {
    public BootLoader getBootLoader(ReadOnlyMemory readOnlyMemory) {
        return new BootLoader();
    }
}
