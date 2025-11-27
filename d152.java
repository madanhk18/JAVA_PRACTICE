public class d152 {
    public static void main(String[] args) {
        int [][]arr2D={
                {1 , 1 , 1},
                {1 ,0 , 1},
                {1 , 1 , 1}
        };
    fetch2DArray(arr2D);
    }
    public static void fetch2DArray(int [][]arr2D){
        int row=arr2D.length;
        int col=arr2D[row-1].length;

        int rowArray[]=new int[row];
        int colArray[]=new int[col];

        System.out.println("row"+row);
        System.out.println("col"+col);

        for (int i = 0; i <arr2D.length ; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] == 0) {
                    rowArray[i] = 1;
                    colArray[j] = 1;
                }
            }
        }
//
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j <arr2D[i].length ; j++) {
                if(rowArray[i]==1 || colArray[j]==1){
                    arr2D[i][j]=0;
                }
            }
        }

        for (int i=0;i<arr2D.length;i++){
            System.out.println();
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" ");
            }
        }
    }
}
