public class demo45 {
    public static void subArray(int[] arr,int tar){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,1};
        int tar=6;
        subArray(arr,tar);
    }
}
