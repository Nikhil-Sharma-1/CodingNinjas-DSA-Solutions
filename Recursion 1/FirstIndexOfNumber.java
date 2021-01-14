
public class Solution {

	public static int firstIndex(int input[], int x) {
		
       return firstIndex(input, x, 0);
		
	}
    
    public static int firstIndex(int input[], int x, int low) {
        
        if(low == input.length - 1) {
            if(low == x) return low;
            return -1;
        }
        
        if(input[low] == x) return low;
        return firstIndex(input, x, low+1);
        
    }
	
}
