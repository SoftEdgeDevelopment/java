package unit03.conditionals.learning14;
//practice boolean light switch on off, true or false
public class SwitchTurnOn {
    public static void main(String[] args) {
/*        make one turnSwitch() method to turn the light on
if it is off or off if it is on.
                Print the information on the console.*/
        //new boolean true or false if the light is on
        boolean lightOn = true;
        //display the status of the light if it is on or off
        //this will be true if boolean is true
        System.out.println("The light is on: " + lightOn);
        //this will be false if boolean is true because the light is not (!) on
        System.out.println("The light is on: " + !lightOn);
    }
}
