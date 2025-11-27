import java.util.Scanner;

public class d218 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
//
//        for (int i = 0; i <r ; i++) {
//            for (int j = 0; j <c ; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        spiralPrint(arr);

    }

    public static void  spiralPrint(int [][]arr){
        int rowB=0,rowE=arr.length-1;
        int colB=0,colE=arr[0].length-1;

        while (rowB<=rowE && colB<=colE){

            for (int i = colB; i <=colE ; i++) {
                System.out.print(arr[rowB][i]+" ");
            }
            rowB++;

            for (int i = rowB; i <=rowE ; i++) {
                System.out.print(arr[i][colE]+" ");
            }
            colE--;

            if(rowB<=rowE) {
                for (int i = colE; i >= colB; i--) {
                    System.out.print(arr[rowE][i]+" ");
                }
            }
            rowE--;

            if(colB<=colE) {
                for (int i = rowE; i >= rowB; i--) {
                    System.out.print(arr[i][colB]+" ");
                }
            }
                colB++;

        }
    }
}
