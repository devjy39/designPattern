package facade;

import facade.Object.*;

public class ComputerFacade {
    private final Power power;
    private final Mainboard mainboard;
    private final HardDiskDrive hdd;
    private final RandomAccessMemory ram;

    public ComputerFacade() {
        this.power = new Power();
        this.mainboard = new Mainboard();
        this.hdd = new HardDiskDrive();
        this.ram = new RandomAccessMemory();
    }

    public void start() {
        power.checkElectric();

        ReadOnlyMemory readOnlyMemory = mainboard.supply(power);
        Bios bios = readOnlyMemory.getBios();

        BootLoader bootLoader = bios.getBootLoader(readOnlyMemory);
        OperateSystem os = bootLoader.findOperateSystem(hdd);

        os.bootStrap(ram);
    }
}
