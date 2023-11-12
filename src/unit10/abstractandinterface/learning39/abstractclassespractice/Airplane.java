package unit10.abstractandinterface.learning39.abstractclassespractice;

//class extending FlyingObject abstract class
public class Airplane extends FlyingObject{

    //implement fly() method from abstract class FlyingObject
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}
