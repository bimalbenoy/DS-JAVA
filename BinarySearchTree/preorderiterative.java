class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st =new Stack<>();
        if(root!=null) st.push(root);
        while(st.size()>0){
            TreeNode x=st.pop();
            ans.add(x.val);
            if(x.right!=null) st.push(x.right);
            if(x.left!=null) st.push(x.left);
        }
        return ans;

        
    }
}
