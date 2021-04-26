import java.util.*;
public class solution {

	public static int maximumProfit(int budget[]) {
	
        Arrays.sort(budget);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<budget.length; i++) {
            if((budget[i] * (budget.length - i)) > max) {
                max = (budget[i] * (budget.length - i));
            }
        }
        
		return max;
	}

}
