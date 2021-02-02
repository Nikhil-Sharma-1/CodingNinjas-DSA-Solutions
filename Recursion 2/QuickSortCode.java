
public class Solution {
	
	public static void quickSort(int[] input) {
		
         quickSort(input, 0, input.length - 1);
		
	}
    
    public static void quickSort(int[] input, int sI, int eI) {
        
        if(sI >= eI) {
            return;
        }
        
        int pivotElement = partition(input, sI, eI);
        quickSort(input, sI, pivotElement - 1);
        quickSort(input, pivotElement + 1, eI);
        
    }
    
    private static int partition(int[] input, int sI, int eI) {
        
        int pivot = input[sI];
        int count = 0;
        for(int i = sI + 1; i<=eI; i++) {
            if(input[i] <= pivot) {
                count++;
            }
        }
        int pivotPosition = sI + count;
         		int temp = input[sI];
        		input[sI] = input[pivotPosition];
        		input[pivotPosition] = temp;
        int i = sI, j = eI;
        while(i < pivotPosition && j > pivotPosition) {
            
            if(input[i] <= input[pivotPosition]) i++;
            else if(input[j] > input[pivotPosition]) j--;
            else {
             temp = input[i];
             input[i] = input[j];
             input[j] = temp;
             i++;
        	 j--;
            }
        
        }
        return pivotPosition;
    }
	
}
