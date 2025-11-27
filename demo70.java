public class demo70 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 9};
        int n = arr.length;
        int left[] = new int[n];
        left[0] = 1;

        int right[] = new int[n];
        right[n - 1] = 1;

        int res[] = new int[n];

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        for (int j = n-2; j >=0 ; j--) {
            right[j]=right[j+1]*arr[j+1];
        }
        for (int k = 0; k < res.length ; k++) {
            res[k]=left[k]*right[k];
        }
        for(int a:res)
            System.out.println(a);
//    }
    }
}
