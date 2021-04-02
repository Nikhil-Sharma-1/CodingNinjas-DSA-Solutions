
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	
        int i = 0, j = arr.length - 1;
        while(i < j) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[j] ^ arr[i];
            arr[i] = arr[i] ^ arr[j];
            i++;
            j--;
        }
        
       i = 0;
       j = arr.length - 1 - d;
        while(i < j) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[j] ^ arr[i];
            arr[i] = arr[i] ^ arr[j];
            i++;
            j--;
        }
        
       i = arr.length - d;
       j = arr.length - 1;
        while(i < j) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[j] ^ arr[i];
            arr[i] = arr[i] ^ arr[j];
            i++;
            j--;
        }
        
    }

}
