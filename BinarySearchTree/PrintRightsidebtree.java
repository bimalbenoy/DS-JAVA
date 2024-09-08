class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));

    }//to find the level
    public void dfs(TreeNode root,int level,List<Integer> ans){
        if(root==null) return;
        
            ans.set(level,root.val);//his the main method here we set root.val to the corresponding index which is levels 
      //but the finale element we always place in the correspondiing index is always the last element of the iteration which is always the right element  
        

        dfs(root.left,level+1,ans);//preorder same methode
        dfs(root.right,level+1,ans);
    }
    
    public List<Integer> rightSideView(TreeNode root){
        int n=levels(root);//return the level
        List<Integer> ans=new ArrayList<>();//arraylist to store the answer
        for(int i=0;i<n;i++){
            ans.add(0);

        }//to makee all the elemets of the array inilialy zero
        dfs(root,0,ans);
        return ans;

        
    }
}
