package Recursion;

public class r5 {
    public static void main(String[] args) {
        int arr[]={3,6,7,3,1};
        int l=0;int r=arr.length-1;
        recursionRevArray(arr,l,r);
        for(int v:arr){
            System.out.print(v+" ");
        }
    }
    public static void recursionRevArray(int []arr,int l,int r){
        if(l>=r)
            return;

        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        recursionRevArray(arr,l+1,r-1);
    }

}
