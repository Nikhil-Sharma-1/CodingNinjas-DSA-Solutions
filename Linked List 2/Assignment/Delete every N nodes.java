public class Solution {
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		
        if(M == 0) return null;
        if(N == 0) return head;
        
        LinkedListNode<Integer> temp = head;
        int i = 1;
        while(temp != null) {
            if(i == M) {
                LinkedListNode<Integer> temp2 = temp;
                int var = 0;
                while(var <= N && temp != null) {             
                    temp = temp.next;
                    var++;
                }
                temp2.next = temp;
                i = 1;
            } else {
            i++;
            temp = temp.next;
            }
        }
        return head;
	}
}
