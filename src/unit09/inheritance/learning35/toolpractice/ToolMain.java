package unit09.inheritance.learning35.toolpractice;

//main method
public class ToolMain {
    public static void main(String[] args) {
        Tool tool1 = new Tool("Saw","Jackson");
        PowerTool powerTool1 = new PowerTool("Jack Hammer","Timmy's",12.0);
        BatteryPowerTool batteryPowerTool1 = new BatteryPowerTool("Power Drill","Frank's",12.0,9);

        //call to the super() constructors to display all information of the subclass object
        System.out.println(batteryPowerTool1.getBrand() + ": " + batteryPowerTool1.getName() + " is a " + batteryPowerTool1.getAmper() + " amper, running " +batteryPowerTool1.getBatteryWatt() + " watts");
    }
}
