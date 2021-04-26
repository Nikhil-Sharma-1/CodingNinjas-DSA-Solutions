public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		
        int k = -1;
        while(head != null) {
            k++;
            if(k == i) {
                System.out.println(head.data);
                break;
            }
            head = head.next;
        }

	}
}
