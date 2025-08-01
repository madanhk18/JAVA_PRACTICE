public class demo26 {
    public static void insertAtPosition(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int newArray[]=new int[arr.length+1];
        int index=0;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==target){
                index=mid;
            } else if (arr[mid]>target) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        index=low;

        for (int i = 0; i <index ; i++) {
            newArray[i]=arr[i];
        }
        newArray[index]=target;
        for (int j= index; j <arr.length ; j++) {
            newArray[j+1]=arr[j];
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,8,10,11};
        int target=12;
      insertAtPosition(arr,target);
    }
}
