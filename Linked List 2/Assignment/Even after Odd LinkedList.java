public class Solution {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        
        if(head == null) {
            return head;
        }
		
        LinkedListNode<Integer> oddH = null;
        LinkedListNode<Integer> oddT = null;
        LinkedListNode<Integer> evenH = null;
        LinkedListNode<Integer> evenT = null;
        
        while(head != null) {
            if(head.data % 2 != 0) {
                if(oddH == null) {
                    oddH = head;
                    oddT = head;
               } else {
                oddT.next = head;
                oddT = oddT.next;
               }
            } 
            
            else { 
               if(evenH == null) {
                    evenH = head;
                    evenT = head;                   
                } else {
                evenT.next = head;
                evenT = evenT.next;
            }
        }
            head = head.next;
        }
        
        if(oddH == null) { //Koi bhi odd element nhi tha.
            evenT.next = null;
            return evenH;
        }
        
       else if(evenH == null) {
            oddT.next = null;
            return oddH;
        }
        
        else {  
        oddT.next = null;
        evenT.next = null;
        oddT.next = evenH;
        }
        return oddH;
	}
}
