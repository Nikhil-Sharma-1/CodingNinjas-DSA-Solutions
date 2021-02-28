import java.util.*;
public class Solution {
    public static ArrayList<String> FindPermutations(String STR) {

        return FindPermutations(STR, "");

    }
    
    public static ArrayList<String> FindPermutations(String STR, String ans) {
        
        
        if(STR.length() == 0) {
            ArrayList<String> ll = new ArrayList<>();
            ll.add(ans);
            return ll;
        }
        
        for(int i = 0; i<STR.length(); i++) {
            String in = STR.substring(0, i) + STR.substring(i+1, STR.length());
           return FindPermutations(in, ans + STR.charAt(i));
        }
         return ll;
    }

}
