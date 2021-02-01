public class solution {

	public static void mergeSort(int[] input){
		
        mergeSort(input, 0, input.length-1);
		
	}
    
    public static void mergeSort(int[] input, int low, int high) {
        
        if(low >= high) {
            return;
        }
        
        int mid = (low + high) / 2;
        
        mergeSort(input, low, mid);
        mergeSort(input, mid + 1, high);
        
        merge(input, low, high);
        
    }
    
    public static void merge(int[] input, int low, int high) {
        
        int mid = (low + high) / 2;
        int i = low;
        int j = mid + 1;
        int k = 0;
        int ans[] = new int[high - low + 1];
        
        while(i <= mid && j <= high) {
            if(input[i] < input[j]) {
                ans[k] = input[i];
                k++;
                i++;
            } else {
                ans[k] = input[j];
                k++;
                j++;
            }
        }
        while(i <= mid) {
            ans[k] = input[i];
            k++;
            i++;
        }
        
        while(j <= high) {
            ans[k] = input[j];
            k++;
            j++;
        }
        
        for(int index = 0; index<ans.length; index++) {
            input[low + index] = ans[index];
        }
    }
}
