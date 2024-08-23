class Solution {
    public static int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void bfs(TreeNode root,int x,int y,List<Integer> arr){
        if(root==null) return ;
        if(x==y) arr.add(root.val);
        bfs(root.left,x,y+1,arr);
        bfs(root.right,x,y+1,arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
       
        int lvl=level(root);
        for(int i=0;i<lvl;i++){
             List<Integer> arr=new ArrayList<>();
            bfs(root,i,0,arr);
            ans.add(arr);
        }
        return ans;
        
        
        

        
        


    }
    
}
