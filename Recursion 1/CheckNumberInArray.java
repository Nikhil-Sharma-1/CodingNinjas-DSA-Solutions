public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		
        if(input.length == 1) {
            if(input[0] == x) return true;
            return false;
        }
        if(input[0] == x) {
            return true;
        }
        int smallArray[] = new int[input.length - 1];
        for(int i = 1; i<input.length; i++) {
            smallArray[i-1] = input[i];
        }
        boolean ans = checkNumber(smallArray, x);
        
        return ans;
       
		
	}
}
