package unit09.inheritance.learning35.computerpractice;

public class Laptop extends Computer{
    private int batteryLife;

    //super constructor from Computer
    public Laptop(String processor, int storage, int batteryLife) {
        super(processor, storage);
        this.batteryLife = batteryLife;
    }

    public void info(){
        //super method from Computer class
        super.info();
        //add and display the batterLife
        System.out.println("The battery life is: " + batteryLife + " hours");
    }

    //getters and setters
    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryLife=" + batteryLife +
                '}';
    }
}
