package unit02.objects.learning08;

public class Practice1 {
    //new private for num
    private double num;
    //generate constructor to assign parameters to private variable
    public Practice1(double num) {
        this.num = num;
    }
    //create method to return half the value of the number
    public double halfValue(){
        //new variable result = num divided by 2
        double result = num / 2;
        //return the value of the num after maths to halfValue
        return result;
    }
    //create method to return 3 times the value of the number
    public double tripleValue(){
        //new variable result = num times 3
        double result = num * 3;
        //return the value of the num after maths to tripleValue
        return result;
    }
    //create method to return 10 times the value of the number
    public double tenTimesValue(){
        //faster way to return num to tenTimesValue without creating new variable
        return num * 10;
    }
}
