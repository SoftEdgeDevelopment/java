package unit08.twod.arrays.learning33.twodarraysinmethods;

//method to find a search key of a 2d String array

import java.util.Arrays;

public class SearchAValue {
    public static void main(String[] args) {
        // create a 2d array of strings
        String[][] words = {{"apple", "banana"}, {"kiwi", "strawberry", "melon"}, {"pear", "apple"}};

        // specify the key you want to search for
        String keyToSearch = "kiwi";

        // call the search method to find if the key is in the array
        boolean found = search(words, keyToSearch);

        // check if the key was found and print the appropriate message
        if (found) {
            System.out.println("The key '" + keyToSearch + "' was found in the array.");
        } else {
            System.out.println("The key '" + keyToSearch + "' was not found in the array.");
        }
        //call to the search2 method to display if the search word is contained in the 2d array
        System.out.println(search2(words,"hello"));
        System.out.println(search2(words,"apple"));
    }


    // search method that searches for the key in the 2d array
    public static boolean search(String[][] arr, String key) {
        // foreach array in the 2d array
        for (String[] arrays : arr) {
            // foreach element in the array column
            for (String word : arrays) {
                // check if the current element equals the key
                if (word.equals(key)) {
                    // key found in the array, return true
                    return true;
                }
            }
        }
        // key not found in the array, return false
        return false;
    }

    //another method
    public static boolean search2(String[][] arr, String key) {
        for (String[] arrays : arr) {
            if(Arrays.asList(arrays).contains(key)){
                return true;
            }
        }
        return false;
    }

    //one more way to write using .indexOf() instead of using .contains()
//    public static boolean search2(String[][] arr, String key) {
//        for (String[] arrays : arr) {
//            if(Arrays.asList(arrays).indexOf(key)>=0){
//                return true;
//            }
//        }
//        return false;
//    }
}
