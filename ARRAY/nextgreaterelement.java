public class nextgreatest {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,4,1};
        int n=arr.length;
        int ans[]=new int[n];
        ans[n-1]=-1;
        int curr=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=curr;
            curr=Math.max(curr, arr[i]);
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
    
}
