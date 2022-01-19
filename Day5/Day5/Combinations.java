package Day5;

import java.util.HashSet;
import java.util.Set;

public class Combinations {
    public static void findInterleavings(String curr, String X, String Y,
                                         Set<String> interleavings)
    {
        // insert `curr` into the set if the end of both strings is reached
        if (X.length() == 0 && Y.length() == 0)
        {
            interleavings.add(curr);
            return;
        }
 
        // if the string `X` is not empty, append its first character in the
        // result and recur for the remaining substring
 
        if (X.length() > 0) {
            findInterleavings(curr + X.charAt(0), X.substring(1), Y, interleavings);
        }
 
        // if the string `Y` is not empty, append its first character in the
        // result and recur for the remaining substring
 
        if (Y.length() > 0) {
            findInterleavings(curr + Y.charAt(0), X, Y.substring(1), interleavings);
        }
    }
    public static Set<String> findInterleavings(String X, String Y)
    {
        // use set to handle duplicates
        Set<String> interleavings = new HashSet<>();
 
        if (X.length() == 0 && Y.length() == 0) {
            return interleavings;
        }
 
        findInterleavings("", X, Y, interleavings);
        return interleavings;
    }
 
    public static void main(String[] args)
    {
        String X = "ABC";
        String Y = "ACB";
 
        // use set to handle duplicates
        Set<String> interleavings = findInterleavings(X, Y);
        System.out.println(interleavings);
    }
}
