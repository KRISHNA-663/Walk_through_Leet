class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        helper(root,l);
        return l;
    }
    public void helper(TreeNode node,List<Integer> l){
        if(node==null)return;
        l.add(node.val);
        helper(node.left,l);
        helper(node.right,l);
    }
}