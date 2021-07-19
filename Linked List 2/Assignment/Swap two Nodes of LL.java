public class Solution {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		
        if(i == j) return head;
        
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> curr1 = null, curr2 = null, prev1 = null, prev2 = null;
        
        int pos = 1;
        
        while(temp != null) {
            if(pos == i) {
                prev1 = temp;
                curr1 = temp.next;
            } else if(pos == j) {
                prev2 = temp;
                curr2 = temp.next;
            }
            temp = temp.next;
            pos += 1;
        }
        
        if(prev1 != null) {
            prev1.next = curr2;
        } else {
            head = curr2;
        }
        
        if(prev2 != null) {
            prev2.next = curr1;
        } else {
            head = curr1;
        }
        
        
        LinkedListNode<Integer> currentFirstNode = curr1.next;
        curr1.next = curr2.next;
        curr2.next = currentFirstNode;
        
        return head;
	}

}
