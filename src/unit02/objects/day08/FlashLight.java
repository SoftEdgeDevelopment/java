package unit02.objects.day08;
//new class for flashlight
public class FlashLight {
//    new private instance variable boolen true or false
    private boolean isOn;
//    constructor with no parameters set to false
    public FlashLight() {
        this.isOn = false;
    }

    //new method to turn flashlight off
    public void turnOff(){
        //assign variable to false
        isOn = false;
        System.out.println("Flaslight is off");
    }

    //new method to turn flashlight on
    public void turnOn(){
        //assign variable to true
        isOn = true;
        System.out.println("Flaslight is on");
    }
}
