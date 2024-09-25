class Solution {
    public void inorder(ArrayList<Integer> arr,TreeNode root){
        if (root==null) return;
        inorder(arr,root.left);
        arr.add(root.val);
        inorder(arr,root.right);

    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>(); 
        inorder(arr,root);
        for(int i=1;i<arr.size();i++)
        if(arr.get(i)<arr.get(i-1)){
            return false;
        }
        return true;
        
    }
}
//or
class Solution {
    static boolean flag;
    public long max(TreeNode root){
        if (root==null) return Long.MIN_VALUE;
        long a=root.val;

        long b=max(root.left);
        if(a<=b) flag=false;
        long c=max(root.right);
        
        
        return Math.max(a,Math.max(b,c));


    }
        public long min(TreeNode root){
        if (root==null) return Long.MAX_VALUE;
        long a=root.val;

        long b=min(root.left);
        
        long c=min(root.right);
        if(c<=a) flag=false;
        
        
        return Math.min(a,Math.min(b,c));


    }
    public boolean isValidBST(TreeNode root) {
        flag=true;
        min(root);
        max(root);
        
        return flag;
        
    }
}
