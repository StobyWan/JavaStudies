/**
 * Created by bbstober on 4/20/17.
 */
public class Anagram {
public static int NUMBER_LETTERS = 26;


    public static int numberNeeded(String first, String second){
        int[] charCount1 = getCharCount(first);
        int[] charCount2 = getCharCount(second);
        return getDelta(charCount1, charCount2);
    }

    public static int[] getCharCount(String s){
        int[] charCounts = new int[NUMBER_LETTERS];
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            int offset = (int) 'a';
            int code = c - offset;
            charCounts[code]++;
        }
        return charCounts;
    }

    public static int getDelta(int[] one, int[] two){
       if(one.length != two.length){
           return -1;
       }

       int delta = 0;

       for(int i = 0; i < one.length; i++){
           int diff = Math.abs(one[i] - two[i]);
           delta += diff;
       }

        return delta;
    }
}
