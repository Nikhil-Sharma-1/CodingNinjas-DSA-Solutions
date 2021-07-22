//O(N)
import java.util.Stack;
public class Solution {

	public static int[] stockSpan(int[] price) {
		int[] arr = new int[price.length];
        Stack<Integer> st = new Stack<>();
        arr[0] = 1;
        st.push(0);
        
        for(int i = 1; i < price.length; i++) {
            while(st.size() > 0 && price[i] > price[st.peek()]) {
                st.pop();
            }
            
            if(st.size() == 0) {
                arr[i] = i + 1;
            } else {
                arr[i] = i - st.peek();
            }
            
            st.push(i);
        }
        return arr;
	}
}


// O(N^2)
// import java.util.*;
// public class Solution {

// 	public static int[] stockSpan(int[] price) {
// 		int arr[] = new int[price.length];
//         Arrays.fill(arr, 1);
//         for(int i = 1; i<price.length; i++) {
//             for(int j = i-1; j >= 0; j--) {
//                 if(price[j] < price[i]) {
//                     arr[i] += 1;
//                 } else break;
//             }
//         }
//         return arr;
// 	}

// }
