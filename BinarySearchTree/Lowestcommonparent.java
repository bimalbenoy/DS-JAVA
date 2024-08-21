class Solution {
    public boolean exist(TreeNode root,TreeNode node){
        if(root==null) return false;
        if(root==node) return true;
        return exist(root.left,node) || exist(root.right,node);


    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root && q==root){
            return root;
        }
        boolean pLiesINLst=exist(root.left,p);
        boolean qLiesINLst=exist(root.left,q);
       
        if(pLiesINLst==true && qLiesINLst==true) return lowestCommonAncestor(root.left,p,q);
        if(pLiesINLst==false && qLiesINLst==false) return lowestCommonAncestor(root.right,p,q);
        else return root;


        
    }
}
