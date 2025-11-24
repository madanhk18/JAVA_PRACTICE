
public class d157 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,12},
                {4,5,6,22},
                {7,8,9,43},
                {10,11,98,29}
        };
        letsTranspose(arr);
    }
    public static void  letsTranspose(int [][]arr){
        int n=arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j < n ; j++) {
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
            }
        }
        System.out.println("TRANSPOSED MATRIX");
        printMatrix(arr);

        for (int row = 0; row <n ; row++) {
            reverse(arr,row);
        }
        System.out.println("REVERSED MATRIX");
        printMatrix(arr);
    }
    public static void reverse(int [][]arr,int row){
        int l=0;int r=arr[row].length-1;
        while(l<=r){
            int temp=arr[row][l];
            arr[row][l]=arr[row][r];
            arr[row][r]=temp;
            l++;r--;
        }
    }
    public static void printMatrix(int [][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
