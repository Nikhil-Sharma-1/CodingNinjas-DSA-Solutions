public class solution {

	public static void printAllPossibleCodes(String input) {
		
         printAllPossibleCodes(input, "");

	}
    
    
    public static void printAllPossibleCodes(String input, String ans) {
        
        if(input.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        int n = input.charAt(0) - '0';
        char help = helper(n);
        
        printAllPossibleCodes(input.substring(1), ans + help);
        
        if(input.length() >= 2) {
            
            int m1 = input.charAt(0) - '0';
            int m2 = input.charAt(1) - '0';
            int m = (m1 * 10) + m2;
            
            if(m >= 10 && m <= 26) {
                char help2 = helper(m);
                printAllPossibleCodes(input.substring(2), ans + help2);
            }
        }
        
    }
    
    public static char helper(int n) {
        return (char)('a' + n - 1);
    }
}
