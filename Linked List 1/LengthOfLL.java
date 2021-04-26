public class Solution {

	public static int length(LinkedListNode<Integer> head){
		
        int length = 0;
        while(head != null) {
            length++;
            head = head.next;
        }
        return length;
	}
}
