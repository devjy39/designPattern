package facade.Object;

public class ReadOnlyMemory {
    public Bios getBios() {
        return new Bios();
    }
}
