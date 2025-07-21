public class demo7 {
    public static void  suffle(int []arr,int n) {
        int newArr[] = new int[arr.length];
        int index = -1;

        for (int i = 0; i < n; i++) {
            index += 1;
            newArr[index] = arr[i];
            index += 1;
            newArr[index] = arr[i + n];
//}
        }
            for (int c : newArr) {
                System.out.print(c + " ");
            }

    }

    public static void main(String[] args) {
        int arr[]={2,5,1,3,4,7};
        int n=3;
        suffle(arr,n);
    }
}
