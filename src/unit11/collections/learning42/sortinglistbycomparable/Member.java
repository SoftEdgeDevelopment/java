package unit11.collections.learning42.sortinglistbycomparable;

//must implement Comparable to use in Main with the type being as itself <Member> (comparator)
public class Member implements Comparable<Member> {
    private String name;

    //generate constructor
    public Member(String name) {
        this.name = name;
    }

    //generate override toString method
    @Override
    public String toString() {
        return "Member{" + "name='" + name + '\'' + '}';
    }

    //must implement method compareTo while using comparable interface
    @Override
    public int compareTo(Member o) {
        return 0;
    }
}
