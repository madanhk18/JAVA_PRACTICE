import java.util.Arrays;

public class d183 {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10, 8};
        PrevSmall(arr);
    }

    public static void PrevSmall(int[] arr) {
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
            if(res[i]==0)
                res[i]=-1;
        }
        System.out.println(Arrays.toString(res));
    }
}
