public class Solution {
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        
        if(head == null || head.next == null) {
            return true;
        }
        
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> newNode = new LinkedListNode(temp.data);
        temp = temp.next;
        LinkedListNode<Integer> temp2 = newNode;
        
        while(temp != null) {
            newNode = new LinkedListNode<Integer>(temp.data);
            newNode.next = temp2;
            temp2 = newNode;
            temp = temp.next;
        }
        temp = head;
        boolean palin = true;
        while(temp != null) {
            if(temp.data != temp2.data) {
                palin = false;
                break;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        return palin;
    }
        
}
