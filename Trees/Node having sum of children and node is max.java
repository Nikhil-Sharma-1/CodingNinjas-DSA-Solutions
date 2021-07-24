
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




    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
        if(root == null) return null;
        Pair ans = helper(root);
        return ans.node;
    }

    public static Pair helper(TreeNode<Integer> root) {
        Pair ans = new Pair();
        ans.node = root;
        int sum = root.data;
        for(int i = 0; i < root.children.size(); i++) {
            sum += root.children.get(i).data;
        }
        ans.xSum = sum;

        for(int i = 0; i < root.children.size(); i++) {
            Pair smallAns = helper(root.children.get(i));
            if(smallAns.xSum > ans.xSum) {
                ans.xSum = smallAns.xSum;
                ans.node = smallAns.node;
            }
        }
        return ans;
    }


}

class Pair {
    TreeNode<Integer> node;
    int xSum;
}
