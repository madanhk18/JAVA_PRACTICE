import java.util.Scanner;

public class dayextra {
        public static void setZeroes(int[][] matrix) {
            int rows = matrix.length;
            int col = matrix[0].length;

            int rowsArr[] = new int[rows];
            int colsArr[] = new int[col];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] == 0) {
                        rowsArr[i] = 1;
                        colsArr[j] = 1;
                    }
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    if (rowsArr[i] == 1 || colsArr[j] == 1) {
                        matrix[i][j] = 0;
                    }
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println(matrix[i][j]);
                }
            }
        }

    public static void main(String[] args) {
        int[][] matrix =new int [3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values for matrix : \n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                matrix[i][j]=sc.nextInt();
            }

        }
        setZeroes(matrix);

    }
    }

