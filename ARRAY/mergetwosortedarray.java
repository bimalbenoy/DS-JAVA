public class mergetwosortedarray {
    public static void main(String[] args) {
        int arr1[]={1,3,4,7,8};
        int arr2[]={2,5,9,10,11,12};
        int n1=arr1.length;
        int n2=arr2.length;
        int ans[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while (i<n1&&j<n2) {
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
            }
            k++;
            
        }
        if(i==n1){
            while(j<n2){
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(j==n2){
            while(i<n1){
                ans[k]=arr1[i];
                i++;
                k++;
            }
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }


    }
}
