
public class Solution {

	public static int[] allIndexes(int input[], int x) {
		
        return allIndexes(input, x, 0);
		
	}
    
    public static int[] allIndexes(int input[], int x, int low) {
        
        if(low == input.length) {
            return new int[0];
        }
        
       int smallArr[] = allIndexes(input, x, low + 1);
        if(input[low] == x) {
            int answerArr[] = new int[smallArr.length + 1];
            answerArr[0] = low;
            for(int i = 0; i<smallArr.length; i++) {
                answerArr[i+1] = smallArr[i];
            }
            return answerArr;
        }
        return smallArr;
    }
	
}
