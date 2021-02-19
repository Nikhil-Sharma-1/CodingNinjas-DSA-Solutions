public class solution {

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		
        return subsetsSumK(input, k, 0);

	}
    
    public static int[][] subsetsSumK(int input[], int k, int low) {
        
        if(low == input.length) {
            if(k == 0) {
                int sAns[][] = new int[1][0];
                return sAns;
            }
            int sAns[][] = new int[0][0];
            return sAns;
           
        }
        
        int temp[][] = subsetsSumK(input, k - input[low], low + 1);
        int tomp[][] = subsetsSumK(input, k, low + 1);
        
        int ans[][] = new int[temp.length + tomp.length][];
        int m = 0;
        for(int i = 0; i<temp.length; i++) {
            ans[i] = new int[temp[i].length + 1];
            ans[i][0] = input[low];
            for(int j = 1; j<=temp[i].length; j++) {
                ans[i][j] = temp[i][j-1];
            }
            m++;
        }
        
        for(int i = 0; i<tomp.length; i++) {
            ans[i + m] = new int[tomp[i].length];
            
            for(int j = 0; j<tomp[i].length; j++) {
                ans[i + m][j] = tomp[i][j];
            }
        }
        return ans;
    }
}
