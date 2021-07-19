public class Solution {

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> temp = null;
        LinkedListNode<Integer> prev = null;
        
        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
                
        }
        return prev;
	}
}
