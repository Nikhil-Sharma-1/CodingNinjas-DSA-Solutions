public class solution {
	public static void printSubsetsSumTok(int input[], int k) {
		
        int ans[] = new int[0];
        printSubsetsSumTok(input, k, 0, ans);
		
	}
    
    public static void printSubsetsSumTok(int input[], int k, int low, int ans[]) {
        
        if(low == input.length) {
            if(k == 0) {
                for(int e: ans) {
                    System.out.print(e + " ");
                }
                System.out.println();
                return;
            }
            return;
        }
        
        printSubsetsSumTok(input, k, low + 1, ans);
        
        int inAns[] = new int[ans.length + 1];
        int i = 0;
        for(; i<ans.length; i++) {
            inAns[i] = ans[i];
        }
        inAns[i] = input[low];
        
        printSubsetsSumTok(input, k - input[low], low + 1, inAns);
    }
}
