class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root, targetSum);
    }

    public boolean pathSum(TreeNode node, int targetSum) {

        if (node == null) return false; 
    
        targetSum = targetSum - node.val; 
        
        if (targetSum == 0 && node.left == null && node.right == null) {
            return true; 
        }
        
        boolean left = pathSum(node.left, targetSum); 
        
        boolean right = pathSum(node.right, targetSum); 
        
        return left || right;
    }
}
