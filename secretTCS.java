import java.util.*;

public class secretTCS {

    static int N, M, T;
    static char[][] grid_2d;
    static boolean[][][] forbidden_array_3d; // forbidden[t][i][j]
    static List<String> results_list = new ArrayList<>();
    static int[] p = {-1, 1, 0, 0};
    static int[] q = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        grid_2d = new char[N][M];
        for (int i = 0; i < N; i++) {
            String[] row = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < M; j++) {
                grid_2d[i][j] = row[j].charAt(0);
            }
        }
        T = sc.nextInt();
        int I = sc.nextInt();

        forbidden_array_3d = new boolean[T + 1][N][M]; // 1-based time

        for (int k = 0; k < I; k++) {
            int t = sc.nextInt();
            int m1 = sc.nextInt() - 1;
            int n1 = sc.nextInt() - 1;
            int m2 = sc.nextInt() - 1;
            int n2 = sc.nextInt() - 1;
            for (int i = m1; i <= m2; i++) {
                for (int j = n1; j <= n2; j++) {
                    forbidden_array_3d[t][i][j] = true;
                }
            }
        }
        boolean[][] visited_2d = new boolean[N][M];
        // Start DFS from all valid cells at time 1
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!forbidden_array_3d[1][i][j]) {
                    visited_2d[i][j] = true;
                    dfs_fun(i, j, 1, "" + grid_2d[i][j], visited_2d);
                    visited_2d[i][j] = false;
                }
            }
        }

        if (results_list.size() == 1) {
            System.out.println(results_list.get(0));
        } else {
            System.out.println("Not enough clues");
        }
    }

        static void dfs_fun(int x, int y, int time, String path, boolean[][] visited) {
        if (results_list.size() > 1) return; // early stop if multiple paths
        if (time == T) {
            results_list.add(path);
            return;
        }int next_Time = time + 1;

        for (int d = 0; d < 4; d++) {
            int nx = x + p[d];
            int ny = y + q[d];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && !forbidden_array_3d[next_Time][nx][ny]) {
                visited[nx][ny] = true;
                dfs_fun(nx, ny, next_Time, path + grid_2d[nx][ny], visited);
                visited[nx][ny] = false;
            }
        }
    }
}
