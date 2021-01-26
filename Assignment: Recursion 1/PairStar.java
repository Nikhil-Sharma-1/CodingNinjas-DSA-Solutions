
public class solution {

	
	public static String addStars(String s) {
		
        if(s.length() == 1) {
            return s;
        }
        
        String temp = addStars(s.substring(1));
        if(s.charAt(0) == temp.charAt(0)) {
            return s.charAt(0) + "*" + temp;
        }
        return s.charAt(0) + temp;

	}
}
