class Solution {
    public void path(TreeNode root,String s,List<String> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){//finally adding to ans
         s+root.val;
         ans.add(s);
         return;

        }
        path(root.left,s+root.val+"->",ans);//adding to string s 
        path(root.right,s+root.val+"->",ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new Arraylist()<>;
        path(root,"",ans);//"" is used to store store each node ans is used to add  the ffinale value
        return ans;
        
    }
}
