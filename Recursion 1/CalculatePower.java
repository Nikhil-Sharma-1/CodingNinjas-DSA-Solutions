public class Solution {

	public static int power(int x, int n) {
		if(n == 0) {
            return 1;
        }
        if(n % 2 == 0) {
            return power(x*x, n/2);
        }
        return x * power(x, n-1);
		
	}
}
