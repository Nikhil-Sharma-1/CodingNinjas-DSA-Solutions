public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		
        if(head == null) {
            return head;
        }
        LinkedListNode<Integer> temp = head;
        int length = 1;
        while(temp.next != null) {
            length++;
            temp = temp.next;
        }
        
        int count = length - n;
        int i = 1;
        
        LinkedListNode<Integer> curr = head;
        while(i < count) {
            curr = curr.next;
            i++;
            
        }
        
        if(temp == curr) {
            return head;
        }
         LinkedListNode<Integer> head2 = curr.next;
        curr.next = null;
        temp.next = head;
        head = head2;
        
       return head2; 
	}

}
