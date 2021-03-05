import java.util.*;
public class Solution {
    public static ArrayList<String> FindPermutations(String STR) {

        if(STR.length() == 1) {
            ArrayList<String> el = new ArrayList<>();
            el.add(STR.substring(0));
            return el;
        }
        
        ArrayList<String> sl = FindPermutations(STR.substring(1));
        ArrayList<String> ll = new ArrayList<>();
        int k = 0;
         
        for(int i = 0; i<sl.size(); i++) {
            for(int j = 0; j<=(sl.get(i)).length(); j++) {
                ll.add((sl.get(i)).substring(0, j) + STR.charAt(0) + (sl.get(i)).substring(j));
                k++;
            }
        }
        
		return ll;
    }
    

}
