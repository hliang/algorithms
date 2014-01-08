/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int depth = 0;

        if(root != null) {
            depth++;
            int depthLeft = maxDepth(root.left);
            int depthRight = maxDepth(root.right);
            if (depthLeft > depthRight) {
                depth += depthLeft;
            } else {
                depth += depthRight;
            }
        }
        return depth;
    }
}
