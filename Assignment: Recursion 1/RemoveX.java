
public class solution {

	// Return the changed string
	public static String removeX(String input){
		
        if(input.length() == 1) {
            if(input.charAt(0) == 'x') {
                return "";
            } 
            return input;
        }
        
        String temp = removeX(input.substring(1));
        if(input.charAt(0) == 'x') {
            return temp;
        }
	return input.charAt(0) + temp;
	}
}
