
public class solution {

	public static int convertStringToInt(String input){
		
        if(input.length() == 1) {
            return (int)input.charAt(0) - 48;
            
        }
        
        int temp = convertStringToInt(input.substring(0, input.length()-1));
           return temp * 10 + (input.charAt(input.length()-1) - '0');

	}
}
