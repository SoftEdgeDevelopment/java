package unit06.array.learning24.arrayreview;
//practice with arrays
public class Person {
    private String[] friends;
    private String name;
    //generate constructor with parameters for String array friends and String name
    public Person(String[] friends, String name) {
        this.friends = friends;
        this.name = name;
    }
    //generate getters and setters
    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //create main method
    public static void main(String[] args) {
        //create new array for myFriends
        String[] myFriends = {"John", "James", "Jack", "Joe"};
        //create a new person object, assign name and friends
        Person person1 = new Person(myFriends,"Aaron");
    }
}
