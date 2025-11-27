public class d154 {
    public static void main(String[] args) {
        int []arr={2,6,8,9,12,2,4,6};

        reverseAnArray(arr);
        for(int v:arr){
            System.out.print(v+" ");
        }
    }
    public static void reverseAnArray(int []arr){
        int l=0;
        int r=arr.length-1;

        while (l<=r){
            swap(arr,l,r);
            l++;r--;
        }
    }
    public static void swap(int []arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
