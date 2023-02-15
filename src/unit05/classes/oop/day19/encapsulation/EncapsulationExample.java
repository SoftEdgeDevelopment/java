package unit05.classes.oop.day19.encapsulation;

public class EncapsulationExample {
    private int privateNum;
    public int publicNum;
    protected int protectedNum;
    int defaultNum;

    public void setPrivateNum(){
        privateNum = 7;
    }

    public static void main(String[] args) {
        EncapsulationExample a = new EncapsulationExample();
        a.privateNum = 6;
    }
}
