import java.util.*;
public class Solution {

    /*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/



    public static void printLevelWise(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> pendingNode = new LinkedList<>();
        pendingNode.offer(root);
        System.out.println(root.data);
        pendingNode.offer(null);
        while(!pendingNode.isEmpty()) {
            TreeNode<Integer> frontNode = pendingNode.poll();
            if(frontNode == null) {
                if(!pendingNode.isEmpty()) {
                    System.out.println();
                    pendingNode.offer(null);
                } else {
                    break;
                }
            } else {
                for(int i = 0; i < frontNode.children.size(); i++) {
                    System.out.print(frontNode.children.get(i).data + " ");
                    pendingNode.offer(frontNode.children.get(i));
                }
            }

        }
    }

}
