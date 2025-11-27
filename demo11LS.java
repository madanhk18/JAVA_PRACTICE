public class demo11LS {
    public static int LinearSearch(int []arr,int val){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={9,6,4,2,3,5,7,0,1};
        System.out.println( LinearSearch(arr,0));
    }
}
