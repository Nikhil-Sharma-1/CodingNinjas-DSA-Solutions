public class Solution {

	public static void printReverse(LinkedListNode<Integer> root) {
		
        LinkedListNode<Integer> temp = root;
        if(temp == null) {
            return;
        }
        
        printReverse(temp.next);
        System.out.print(temp.data + " ");
	}

}
