
public class solution {

	public static boolean isStringPalindrome(String input) {
        
      return isStringPalindrome(input, 0, input.length());

	}
    
    public static boolean isStringPalindrome(String input, int i, int j) {
        
        if(input.length() == 1 || input.length() == 0) {
            return true;
        }
		
        if(input.charAt(i) == input.charAt(j-1)) {
            
             return isStringPalindrome(input.substring(i+1, j-1), i, j-2);
            
        }
        return false;
    }
    
}
