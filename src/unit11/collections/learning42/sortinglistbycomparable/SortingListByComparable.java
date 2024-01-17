package unit11.collections.learning42.sortinglistbycomparable;

public class SortingListByComparable {

    //example sorting char
    public static void main(String[] args) {
        //shows the distance between each number
        //z to a is up 25 (25)
        System.out.println("z".compareTo("a"));
        //a to b is down 1 (-1)
        System.out.println("a".compareTo("b"));
        //s to s doesn't go anywhere (0)
        System.out.println("s".compareTo("s"));

        char charA = 'a';
        //cast charA to int to display itsvalue
        //a is earlier in the alphabet so it will have less value (the further it is the greater the value)
        System.out.println((int) charA);
        System.out.println((int) 'b');
        System.out.println((int) 'z');
    }
}
