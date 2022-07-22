class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> lst = new ArrayList<>();
        traverse(root,lst);
        return lst;
        
        
    }
    
    public void traverse(TreeNode root, List<Integer> lst){
        
        if(root!=null){
            traverse(root.left,lst);
            lst.add(root.val);
            traverse(root.right,lst);
        }
    }
    
    
}
// Inorder traversal is :Left , Root , Right 