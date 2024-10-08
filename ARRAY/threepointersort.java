class Solution {
    public void swap(int[] arr,int mid,int hi){
        int temp=arr[mid];
        arr[mid]=arr[hi];
        arr[hi]=temp;


    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int hi=n-1;int mid=0;int lo=0;
        while(mid<=hi){
        if(nums[mid]==0){
            swap(nums,mid,lo);
            lo++;mid++;
        }
        else if(nums[mid]==1){
            
            mid++;
        }
        else{
            swap(nums,hi,mid);
            hi--;
        }
        }
        
    }
}
