package unit11.collections.learning42.sortinglistbycomparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//example using comparator with a class implementing Comparable interface
public class MemberListMain {
    public static void main(String[] args) {

        //memberList creating a new List using Member class
        List<Member> memberList = new ArrayList<>(List.of(new Member("john"), new Member("aaron"), new Member("mike"), new Member("franklin"), new Member("peter")));

        //display original order (insertion order)
        System.out.println("Insertion Order: " + memberList);

        //sort using naturalOrder will not work because Member is a class, not a comparable object, must implement Comparable interface from the Member Class for it to work
        memberList.sort(Comparator.naturalOrder());
        System.out.println("Natural Order: " + memberList);

        //can sort after implementing Comparable interface to Member Class
        memberList.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order: " + memberList);
    }
}
