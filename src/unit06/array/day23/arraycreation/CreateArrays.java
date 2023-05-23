package unit06.array.day23.arraycreation;
//practice creating and initializing different types of arrays
public class CreateArrays {
    //an array is a container object that holds a fixed number of values of a single type
    //the length of an array is established when the array is crated, after creation its length is fixed
    //contains a list of values of the same primitive type or object reference type data
    //they are all contained in a single variable
    public static void main(String[] args) {
        //new int array with 5 ints
        int[] numberArray = new int[5];
        //new double array with 10 doubles
        double[] doubleArray = new double[10];
        //new String array with 3 Strings
        String[] strings = new String[3];
        //new boolean with 7 booleans
        boolean[] booleans = new boolean[7];

        /*how to update and reach elements*/
        //updates the number array index 2 value
        numberArray[2] = 30;
        //display the value of numberArray index 2
        System.out.println(numberArray[2]);
        //updates the number array index 0 value
        numberArray[0] = numberArray[2] * 3;
        //display the value of numberArray index 0
        System.out.println(numberArray[0]);
        //will print 0 because no value has been assigned to index 1 in numberArray
        System.out.println(numberArray[1]);

        /*how to get the length*/
        //display the index length of the booleans array           //length is always a final value, is created with the array and never changes
        System.out.println(booleans.length);

        /*practice*/
        //assign doubleArray index 1 to the value of 33.5
        doubleArray[1] = 33.5;
        //assign doubleArray index 5 to half the value of doubleArray index 1
        doubleArray[5] = (doubleArray[1] / 2);
        System.out.println(doubleArray[1]);
        System.out.println(doubleArray[5]);
        //get the value of the last index in the doubleArray and assign it to 100 (index 9 = 100)
        doubleArray[doubleArray.length - 1] = 100;
        //doubleArray[doubleArray.length] = 100;  //index 10          //will not work, will be an error. The index is either negative or greater than or equal to the size of the array. (used index 10, but the max index length is 0-9, 10 digits total)

    }
}
