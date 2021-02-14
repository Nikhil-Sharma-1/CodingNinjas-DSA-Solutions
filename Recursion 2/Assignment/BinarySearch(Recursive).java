public class solution {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		
        return binarySearch(input, element, 0, input.length-1);

	}
    
    public static int binarySearch(int input[], int element, int low, int high) {
        
        if(low > high) {
            return -1;
        }
       
       int mid = (low + high) / 2;
        
       
        if(input[mid] < element) {
           return binarySearch(input, element, mid+1, high);
        } 
        if(input[mid] > element) {
           return binarySearch(input, element, low, mid-1);
        }
        return mid;
    }
}
