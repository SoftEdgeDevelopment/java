package unit02.objects.day08;

public class Practice1 {
//    double value called num
    private double num;
//    constructor

    public Practice1(double num) {
        this.num = num;
    }

//    nonvoid method returns the 2 times
    public double doubleTheValue(){
        double result = num * 2;
        return result;
    }
//    nv m returns half of the number
    public double halfTheValue(){
        return num/2;
//        double result = num/2;
//        return result;
    }

//    nvm returns 3times the number
    public double threeTimesTheValue(){
        return num*3;
    }
//    nv m returns the 10 times the number
}
