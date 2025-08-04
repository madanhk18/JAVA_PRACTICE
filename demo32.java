public class demo32 {
    public static int[] FirstANDLastOccurence(int[] arr,int x) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) { // 2,3,6,9,11,11,11,14,20
            if (arr[i] == x) {                  // 11
                if (first == -1) {
                    first = i; //4
                }
                last = i;//4 -> 5->6
            }
        }
      return new int[]{first,last};
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,9,11,11,11,14,20};
        int x=11;
        FirstANDLastOccurence(arr,x);
    }
}
