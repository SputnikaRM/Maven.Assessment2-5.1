package rocks.zipcode.assessment2.fundamentals;

import java.util.Arrays;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        string1= string1 +string2;
        return string1;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder sb = new StringBuilder(string1);
        string1=sb.reverse().toString();
        return string1;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder s1= new StringBuilder(string1);
        StringBuilder s2 = new StringBuilder(string2);
        string1=s1.reverse().toString();
        string2=s2.reverse().toString();

        return string1+string2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String x = "";
        String [] chars = charactersToRemove.split(" ");
        List<String> list = Arrays.asList(chars);
        for(int y=0;y<string.length();y++){
            if(!(list.contains(String.valueOf(string.charAt(y))))){
                x+= string.charAt(y);
            } }return x;

    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String x = "";
        String [] chars = charactersToRemove.split(" ");
        List<String> list = Arrays.asList(chars);
        for(int y=0;y<string.length();y++){
            if(!(list.contains(String.valueOf(string.charAt(y))))){
                x+= string.charAt(y);
            } }
        StringBuilder sb=new StringBuilder(x);
        return sb.reverse().toString();
    }
}
