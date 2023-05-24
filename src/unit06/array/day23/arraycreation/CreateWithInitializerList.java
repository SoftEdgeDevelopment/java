package unit06.array.day23.arraycreation;
//practice initializing different types of arrays
public class CreateWithInitializerList {
    public static void main(String[] args) {
        //new int array
        int[] numbers = {3, 5, 7, 93, 45};
        //call to index 2
        System.out.println(numbers[2]);
        //call to index 4
        System.out.println(numbers[4]);

        //new string array for cities
        String[] cities = {"New York", "Seattle", "Boston", "Miami","San Francisco"};
        //call to index 0
        System.out.println(cities[0]);
        //call to index 3
        System.out.println(cities[3]);
        //call to the last index
        System.out.println(cities[cities.length - 1]);    //last index value
    }
}
