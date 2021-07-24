
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
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n) {
		if(root == null) return null;
        TreeNode<Integer> nextLargerNode = null;
        if(root.data > n) nextLargerNode = root;
        
        for(int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> nextLargerInChild = findNextLargerNode(root.children.get(i), n);
            if(nextLargerInChild != null) {
                if(nextLargerNode == null || nextLargerInChild.data < nextLargerNode.data) {
                    nextLargerNode = nextLargerInChild;
                }
            }
        }
        return nextLargerNode;
	}
	
}
