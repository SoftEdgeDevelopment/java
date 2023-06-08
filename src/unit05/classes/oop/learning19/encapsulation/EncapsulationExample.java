package unit05.classes.oop.learning19.encapsulation;

public class EncapsulationExample {
    private int privateNum;      //private only available within class
    public int publicNum;       //public available anywhere
    protected int protectedNum;        //protected only available within package or sub package
    int defaultNum;      //default only available within package or sub package

    //private can only be reached within the class
    //new method to set private number
    public void setPrivateNum(){
        //set the value of private num
        privateNum = 13;
        //print the value to be called to the main method
        System.out.println(privateNum);
    }

}
