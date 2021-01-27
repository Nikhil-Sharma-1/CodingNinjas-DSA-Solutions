
public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		
        if(input.length() == 0) {
            return input;
        }
        
        String smallAns = replaceCharacter(input.substring(1), c1, c2);
		if(input.charAt(0) == c1) {
            return c2 + smallAns;
        }
        return input.charAt(0) + smallAns;
	}
}
