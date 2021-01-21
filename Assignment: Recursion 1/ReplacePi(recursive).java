public class solution {

	// Return the changed string
	public static String replace(String input){
		
       if(input.length() <= 1) {
            return input;
        }
        
        String temp = replace(input.substring(1));
        if(input.charAt(0) == 'p' && temp.charAt(0) == 'i') {
            return "3.14"+temp.substring(1);
        } 
            return input.charAt(0) + temp;
       

	}
    
}
