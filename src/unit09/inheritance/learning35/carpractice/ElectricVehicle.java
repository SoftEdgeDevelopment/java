package unit09.inheritance.learning35.carpractice;

//subclass extending Car superclass
public class ElectricVehicle extends Car{
    private int batteryLevel;

    //constructor setting batteryLevel at 100
    public ElectricVehicle(){
        batteryLevel = 100;
    }

    //new String method to return when battery is charging
    public String fill(){
        batteryLevel = 100;
        return "Battery is charging";
    }

    //getters and setters
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "ElectricVehicle{" +
                "batteryLevel=" + batteryLevel +
                '}';
    }
}
