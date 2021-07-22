public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) {
        if(head == null || head.next == null) return;
        Node<Integer> temp = head;
        while(temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
        }
        
    }
    
}
