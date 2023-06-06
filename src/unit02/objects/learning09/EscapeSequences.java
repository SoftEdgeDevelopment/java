package unit02.objects.learning09;

public class EscapeSequences {
    public static void main(String[] args) {
        //escape characters will are quotations inside of a string
        System.out.println("City: \"Boston, MA\"");
        //this is not written correctly
        System.out.println("City: \"\\\"Boston, MA");
        // \t is for tab
        // \n is for writing on a new line
        System.out.println("City:\tBoston\nState:\tMA" );
    }
}
