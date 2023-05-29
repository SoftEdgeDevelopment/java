package practice;

public class Practice17 {
    //traverse each String element and print their length to the console
    public static void main(String[] args) {
        //create new String array with animals assigned
        String[] animals = {"cat", "fish", "doggy", "cow", "horse", "elephant", "gorilla"};
        //create new for loop until the length of the array
        for (int i = 0; i < animals.length; i++) {
            //print out each element in the array
            System.out.println(animals[i] + " ");
            //print out the length of each element in the String array
            System.out.println(animals[i].length());
        }
        //change the first letter of each element to uppercase and update the array
        for (int i = 0; i < animals.length; i++) {
            //get the first letter of each index by using substring, and convert it toUpperCase + the rest of the indexes in each element, starting from the second letter
            animals[i] = animals[i].substring(0,1).toUpperCase() + animals[i].substring(1);
            //prints out the updated animals with the first letter being uppercase
            System.out.println(animals[i] + " ");
        }
    }
}

