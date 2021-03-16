import java.util.*;
public class Solution {

	public static int findDuplicate(int[] arr) {
		//One method :- Time comp = O(NlogN);
        // Arrays.sort(arr);
        // for(int i = 0; i<arr.length; i++) {
        //     if(arr[i] == arr[i + 1]) {
        //         return arr[i];
        //     }
        // }
        
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];   
        }
        
        //sum Of First N - 2 Natural Numbers
        int sumN = ((arr.length - 2) * (arr.length - 1)) / 2;
        
        return sum - sumN;
	}
}
