public class Solution {

    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {

        if(head == null || head.next == null) return head;


        for(int i = 0; i < len(head) - 1; i++) {  //Normal Bubble sort mein bhi poora nhi jaate.
            LinkedListNode<Integer> curr = head;
            LinkedListNode<Integer> prev = null;
            LinkedListNode<Integer> f = curr.next;

            while(curr.next != null) { // Kyunki agar curr ka next null hua to hum curr ko uske next wale se kese compare krenge in line no 29
                if(curr.data <= curr.next.data) {
                    prev = curr;
                    curr = curr.next;
                    f = curr.next;
                } else {
                    if(prev == null) {
                        curr.next = f.next;
                        f.next = curr;
                        prev = f;
                        head = prev;
                    } else {
                        prev.next = f;
                        curr.next = f.next;
                        f.next = curr;
                        prev = f;
                    }

                    f = curr.next;
                }

            }

        }
        return head;
    }

    public static int len(LinkedListNode<Integer> head) {

        int i = 1;
        while(head.next != null) {
            head = head.next;
            i++;
        }
        return i;
    }
}
