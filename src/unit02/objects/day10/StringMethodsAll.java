package unit02.objects.day10;

public class StringMethodsAll {
    public static void main(String[] args) {
//        substring(beginIndex)
        String state = "Denver";
        System.out.println(state.substring(5));
        System.out.println(state.substring(state.length()-1));
//        System.out.println(state.substring(9));
        String otherState = "California";
        System.out.println(state.equals(otherState));
        String newState = "Denver";
        System.out.println(state.equals(newState));
        System.out.println("California".equals(otherState));

        System.out.println("John".charAt(3));

        String emptyString = "";
        System.out.println(emptyString.isEmpty());
        System.out.println(newState.isEmpty());

        System.out.println(newState.toUpperCase());
        System.out.println("NEW YORK".toLowerCase());

        System.out.println(" trimmer ".trim());
        System.out.println("         trimAndUpperCase ".trim().toUpperCase());

        System.out.println("Mr. Aziz".startsWith("Mr"));
        System.out.println("Ms. John".endsWith("John"));

        System.out.println("John Doe".endsWith("John"));

        System.out.println("SDET is best.".replace("best", "awesome"));
        System.out.println("SDET is best of the best".replace("best", "awesome"));
        System.out.println("aaaabbbcccddd".replaceFirst("a", "x"));

        System.out.println("A".compareTo("A"));
        System.out.println("A".compareTo("B"));
        System.out.println("B".compareTo("A"));
    }
}
