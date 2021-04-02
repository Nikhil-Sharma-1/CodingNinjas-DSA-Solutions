public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	
        int count = 0;
        for(int i = 0; i<arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]) count++;
            else break;
        }
        
        if(count == arr.length - 1 || count == 0) 
        {
            count = 0;
            return count;
        }
        return count + 1;
    }

}
