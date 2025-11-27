public class d91 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 4, 5};
        System.out.println("Is Sorted: " + isSorted(arr));
    }
    public static boolean isSorted(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            if(arr[i] <= arr[i+1]){

            }else
                return false;
        }
        return true;
    }
}
