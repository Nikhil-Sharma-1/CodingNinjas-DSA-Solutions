public class Stack {

    private Node head;
    private int size;


    public Stack() {
        head = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void push(int element) {
        Node toAdd = new Node(element);
        toAdd.next = head;
        head = toAdd;
        size++;
    }

    public int pop() {
        if(size == 0) {
            return -1;
        }
        Node remove = head;
        head = head.next;
        size--;
        return remove.data;
    }

    public int top() {
        if(size == 0) {
            return -1;
        }
        return head.data;
    }
}
