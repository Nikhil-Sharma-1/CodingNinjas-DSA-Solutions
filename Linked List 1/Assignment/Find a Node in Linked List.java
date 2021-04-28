public class Solution {

	public static int findNode(LinkedListNode<Integer> head, int n) {
		
        LinkedListNode<Integer> temp = head;
        
        if(head == null) {
            return -1;
        }
        int i = 0;
        while(temp.next != null) {
            
            if(temp.data == n) {
                return i;
            }
            
            temp = temp.next;
            i++;
        }
        return -1;
	}
}
