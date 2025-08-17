public class demo47 {
    public static void  moveZeroToEnd(int[] arr){
        int newArray[]=new int[arr.length];
        int cnt0=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            newArray[index]=arr[i];
            index++;
        }
        while(cnt0>=0){
            newArray[index]=0;
            cnt0--;
            index++;
        }
        for (int n:newArray){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        moveZeroToEnd(arr);
    }
}
