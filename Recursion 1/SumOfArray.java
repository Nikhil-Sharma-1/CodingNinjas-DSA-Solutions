public class Solution {

	public static int sum(int input[]) {
        
        if(input.length < 1) {
            return input.length;
        }
		
        if(input.length == 1) {
            return input[0];
        }
        int smallArray[] = new int[input.length - 1];
        for(int i = 1; i<input.length; i++) {
            smallArray[i-1] = input[i];
        }
        int smallSum = sum(smallArray);
        return input[0] + smallSum;
		
	}
}
