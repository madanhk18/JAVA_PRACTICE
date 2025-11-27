public class demo69 {
    public static void maxProduct(int[] arr){
int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                int prod=1;
                for (int k =i; k <j ; k++) {
                    prod*=arr[k];
                }
                System.out.println(prod);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        maxProduct(arr);
    }
}
