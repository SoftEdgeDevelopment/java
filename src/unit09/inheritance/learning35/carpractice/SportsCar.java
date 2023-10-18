package unit09.inheritance.learning35.carpractice;

public class SportsCar extends Car{
    private int maxSpeed;

    public SportsCar(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String drive(){
        return "Driving at a high speed";
    }

    //getters and setters
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
