import java.util.*;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
		Arrays.sort(arr);
        int count = 0;
        
        for(int i = 0; i<arr.length - 2; i++) {
            count += twoSum(arr, num - arr[i], i+1);
        }
        
        return count;
	}
    
    public static int twoSum(int[] arr, int num, int i) {
        int j = arr.length - 1;
        int k = 0;
        
        while(i < j) {
            if(arr[i] + arr[j] > num) j--;
            else if(arr[i] + arr[j] < num) i++;
            else {
                int startElement = arr[i];
                int endElement = arr[j];
                
                if(startElement == endElement) {
                    int elementFromStartToEnd = (j - i) + 1;
                    k += (elementFromStartToEnd * (elementFromStartToEnd - 1)) / 2;
                    return k;
                }
                
                int tempStartIndex = i + 1;
				int tempEndIndex = j - 1;

				while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == startElement) {
					tempStartIndex += 1;
				}
				
				while(tempEndIndex >= tempStartIndex && arr[tempEndIndex] == endElement) {
					tempEndIndex -= 1;
				}

				int totalElementsFromStart = (tempStartIndex - i);
				int totalElementsFromEnd = (j - tempEndIndex);
				
				k += (totalElementsFromStart * totalElementsFromEnd);


				i = tempStartIndex;
				j = tempEndIndex;
            }
        }
        return k;
    }
}
