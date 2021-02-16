public class solution {
	public static void printSubsets(int input[]) {
		
        int ans[] = new int[0];
        printSubsets(input, ans, 0);

	}
    
    public static void printSubsets(int input[], int ans[], int low) {
        
        if(low == input.length) {
            
            for(int e: ans) {
                System.out.print(e + " ");
            }
            System.out.println();
            return;
            
        }
        
        printSubsets(input, ans, low + 1);
        int newAns[] = new int[ans.length + 1];
        int i;
        for(i = 0; i<ans.length; i++) {
            newAns[i] = ans[i];
        }
        newAns[i] = input[low];
        printSubsets(input, newAns, low + 1);
    }
}
