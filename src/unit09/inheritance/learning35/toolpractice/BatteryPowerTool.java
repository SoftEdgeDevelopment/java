package unit09.inheritance.learning35.toolpractice;

//subclass extending PowerTool
public class BatteryPowerTool extends PowerTool{
    private int batteryWatt;

    public BatteryPowerTool(String name, String brand, double amper, int batteryWatt) {
        super(name, brand, amper);
        this.batteryWatt = batteryWatt;
    }

    public int getBatteryWatt() {
        return batteryWatt;
    }

    public void setBatteryWatt(int batteryWatt) {
        this.batteryWatt = batteryWatt;
    }

    @Override
    public String toString() {
        return "BatteryPowerTool{" +
                "batteryWatt=" + batteryWatt +
                '}';
    }
}
