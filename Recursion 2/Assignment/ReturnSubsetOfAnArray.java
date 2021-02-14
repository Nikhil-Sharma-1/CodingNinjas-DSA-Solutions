public class solution {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		
        return subsets(input, 0);

	}
    
    public static int[][] subsets(int input[], int low) {
        
        if(low >= input.length) {
            int ans[][] = new int[1][0];
            return ans;
        }
        
        int smallArr[][] = subsets(input, low + 1);
        int ans[][] = new int[smallArr.length * 2][];
        
        int k = 0;
        for(int i = 0; i<smallArr.length; i++) {
            ans[i] = new int[smallArr[i].length];
            for(int j = 0; j<smallArr[i].length; j++) {
                ans[i][j] = smallArr[i][j];
            }
            k++;
        }
        
        for(int i = 0; i<smallArr.length; i++) {
            ans[i + k] = new int[smallArr[i].length + 1];
            ans[i + k][0] = input[low]; 
            for(int j = 1; j<=smallArr[i].length; j++) {
                ans[i + k][j] = smallArr[i][j - 1];
            }
        }
        return ans;
    }
}
