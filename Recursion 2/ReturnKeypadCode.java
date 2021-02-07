public class solution {

	
	public static String[] keypad(int n){
		
        if(n == 0) {
            return new String[] {""};
        }
        
        String smallAns[] = keypad(n/10);
        String helper[] = helper(n%10);
        String ans[] = new String[helper.length * smallAns.length];
        int k = 0;
        for(int i = 0; i<smallAns.length; i++) {
            for(int j = 0; j<helper.length; j++) {
                ans[k] = smallAns[i] + helper[j];
                k++;
            }
        }
        return ans;
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
