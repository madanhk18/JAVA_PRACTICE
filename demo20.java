public class demo20 {
    public static void insertAtPosition(int []arr,int target) {
        int low = 0;
        int high = arr.length - 1;
        int positionInsert = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                positionInsert = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        int newArr[] = new int[arr.length + 1];

        for (int i = 0; i < positionInsert; i++) {
            newArr[i] = arr[i];
        }

        newArr[positionInsert] = target;

        for (int i = positionInsert; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.print("[");
        for (int n:newArr){
            System.out.print(n+" ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,7,9};
        int target=5;
        insertAtPosition(arr,target);
    }
}
