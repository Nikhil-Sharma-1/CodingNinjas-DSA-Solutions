public class Solution {

	public static int count(int n){
        int c = 1;
		if(n == 0){
			
            return 0;
		}
        
        return c + count(n / 10);
		
	}

}
