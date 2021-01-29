public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		
        if(s.length() == 1) {
            return s;
        }
        
        String smallAns = removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0) == smallAns.charAt(0)) {
            return smallAns;
        }
        return s.charAt(0) + smallAns;

	}

}
