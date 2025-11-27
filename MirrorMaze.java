import java.util.HashSet;
import java.util.Scanner;

public class MirrorMaze {

    static int M, N;
    static char[][] grid;
    static int maxLoopLength = 0;

    // Directions: 0: Right, 1: Down, 2: Left, 3: Up
    static int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        sc.nextLine();

        grid = new char[M][N];
        for (int i = 0; i < M; i++) {
            String[] rowChars = sc.nextLine().split(" ");
            for (int j = 0; j < N; j++) {
                // Ensure the string is not empty before accessing charAt(0)
                if (j < rowChars.length && !rowChars[j].isEmpty()) {
                    grid[i][j] = rowChars[j].charAt(0);
                } else {
                    // Handle the case where the input is malformed, e.g., a blank space
                    grid[i][j] = '0'; // Assign a default value like '0' for empty cells
                }
            }
        }

        // Iterate through each cell and each possible entry direction
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] != '0') {
                    for (int d = 0; d < 4; d++) {
                        simulate(i, j, d);
                    }
                }
            }
        }
        System.out.println(maxLoopLength);
        sc.close();
    }

    private static void simulate(int startRow, int startCol, int startDir) {
        // Use a HashSet to detect loops and count unique cells
        HashSet<String> path = new HashSet<>();
        int currentRow = startRow;
        int currentCol = startCol;
        int currentDir = startDir;

        // Count of cells visited in the current path
        int travelCount = 0;

        while (true) {
            String state = currentRow + "," + currentCol + "," + currentDir;
            if (path.contains(state)) {
                maxLoopLength = Math.max(maxLoopLength, travelCount);
                return;
            }

            path.add(state);
            travelCount++;

            int nextRow = currentRow + directions[currentDir][0];
            int nextCol = currentCol + directions[currentDir][1];

            if (nextRow < 0 || nextRow >= M || nextCol < 0 || nextCol >= N || grid[nextRow][nextCol] == '0') {
                return;
            }

            currentRow = nextRow;
            currentCol = nextCol;

            // Update direction
            if (grid[currentRow][currentCol] == '/') {
                if (currentDir == 0) currentDir = 3;
                else if (currentDir == 1) currentDir = 2;
                else if (currentDir == 2) currentDir = 1;
                else if (currentDir == 3) currentDir = 0;
            } else if (grid[currentRow][currentCol] == '\\') {
                if (currentDir == 0) currentDir = 1;
                else if (currentDir == 1) currentDir = 0;
                else if (currentDir == 2) currentDir = 3;
                else if (currentDir == 3) currentDir = 2;
            }
        }
    }
}