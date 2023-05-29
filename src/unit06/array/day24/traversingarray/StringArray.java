package unit06.array.day24.traversingarray;

public class StringArray {
    //traverse each String element and print their length to the console
    public static void main(String[] args) {
        //create new String array with animals assigned
        String[] animals = {"Cat", "Fish", "Doggy", "Cow", "Horse", "Elephant", "Gorilla"};
        //create new for loop until the length of the array
        for (int i = 0; i < animals.length; i++) {
            //print out each element in the array
            System.out.println(animals[i] + " ");
            //print out the length of each element in the String array
            System.out.println(animals[i].length());
        }
    }
}
