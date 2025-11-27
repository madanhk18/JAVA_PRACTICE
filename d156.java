public class d156 {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 2, 3, 3, 3, 4};
        removeDupli(arr);
        for(int n:arr){
            System.out.print(n +" ");
        }
    }

    public static void removeDupli(int[] arr) {
        int i=0;
        for (int j = 1; j <arr.length ; j++) {
            if (arr[j] != arr[i]) {
                arr[++i] = arr[j];
            }
        }
        while(i<arr.length){
            arr[i++]=0;
        }
    }
}
