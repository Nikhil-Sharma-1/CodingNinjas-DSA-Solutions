
public class Solution {

	public static int lastIndex(int input[], int x) {
		
        return lastIndex(input, x, input.length - 1);
        
	}
    
    public static int lastIndex(int input[], int x, int high) {
        
        if(high == 0) {
            if(input[high] == x) return high;
            return -1;
        }
        
        if(input[high] == x) return high;
        return lastIndex(input, x, high - 1);
        
    }
	
}
