public class Solution {

	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		
        LinkedListNode temp = head;
        int i = 0;
        
        if(pos == 0) {
            head = head.next;
            return head;
        }
        while(i < pos - 1 && temp.next != null) {
            temp = temp.next;
            i++;
        }
        if(temp.next == null) {
            return head;
        }
        
        temp.next = temp.next.next;
        return head;
	}
}
