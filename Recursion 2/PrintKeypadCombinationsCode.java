public class solution {

	public static void printKeypad(int input){
		
        printKeypad(input, "");
		
	}
    
    public static void printKeypad(int input, String ans) {
        
        if(input == 0) {
            System.out.println(ans);
            return;
        }
        
        String helper[] = helper(input % 10);
        for(int i = 0; i<helper.length; i++) {
            printKeypad(input/10, helper[i]+ans);
        }
    }
    
     private static String[] helper(int n) {
        
        if(n == 0 || n == 1) {
            return new String[] {""};
        }
		else if(n == 2) {
			return new String[] {"a","b","c"};
		}
		else if(n == 3) {
			return new String[] {"d","e","f"};
		}
		else if(n == 4) {
			return new String[] {"g","h","i"};
		}
		else if(n == 5) {
			return new String[] {"j","k","l"};
		}
		else if(n == 6) {
			return new String[] {"m","n","o"};
		}
		else if(n == 7) {
			return new String[] {"p","q","r","s"};
		}
		else if(n == 8) {
			return new String[] {"t","u","v"};
		}
		else {
			return new String[] {"w","x","y","z"};
		}		
    }
}
