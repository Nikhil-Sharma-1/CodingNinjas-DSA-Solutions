public class Solution {


    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        head = reverse(head);
        int carry = 1, value = 0;

        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> prev = null;

        while(temp != null) {
            value = (temp.data + carry) % 10;
            carry = (temp.data + carry) / 10;
            temp.data = value;
            prev = temp;
            temp = temp.next;
        }

        if(carry == 1) {
            LinkedListNode<Integer> tail = new LinkedListNode<>(carry);
            prev.next = tail;
        }

        return reverse(head);
    }

    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

}
