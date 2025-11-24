import java.util.*;

public class NidhisConstruction {
    // Directions as coordinate changes
    static int[][] Direcs = {
            {0, 1},   // top
            {0, -1},  // down
            {-1, 0},  // left
            {1, 0}    // right
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        // Read all cmdds
        List<String[]> cmdds = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            cmdds.add(sc.nextLine().trim().split(" "));
        }

        int query = sc.nextInt();

        // we need to Sort commands  based on existing cube
        Collections.sort(cmdds, (a, b) -> {
            int e1 = Integer.parseInt(a[0]);
            int e2 = Integer.parseInt(b[0]);
            if (e1 != e2) return e1 - e2;
            return Integer.parseInt(a[1]) - Integer.parseInt(b[1]);
        });

        // Store positions of cubes cubeNumber -> (x, y)
        Map<Integer, int[]> cube_Positions = new HashMap<>();
        // Reverse map: (x, y) -> cubeNumber
        Map<String, Integer> position_Cube = new HashMap<>();

        // Initialize the first existing cube (optional)
        // Assume first existing cube at (0,0)
        int firstOne = Integer.parseInt(cmdds.get(0)[0]);
        cube_Positions.put(firstOne, new int[]{0, 0});
        position_Cube.put("0,0", firstOne);

        // Process all cmdds
        for (String[] cmd : cmdds) {
            int existingOne = Integer.parseInt(cmd[0]);
            int newlyAddedOne = Integer.parseInt(cmd[1]);
            String directions = cmd[2];

            if (!cube_Positions.containsKey(existingOne)) continue;

            int[] base = cube_Positions.get(existingOne);
            int x = base[0];
            int y = base[1];

            // Determine direction offset
            if (directions.equals("top")) y += 1;
            else if (directions.equals("down")) y -= 1;
            else if (directions.equals("left")) x -= 1;
            else if (directions.equals("right")) x += 1;

            String key = x + "," + y;

            // Replace if cube already exists
            if (position_Cube.containsKey(key)) {
                int oldCube = position_Cube.get(key);
                cube_Positions.remove(oldCube);
            }

            cube_Positions.put(newlyAddedOne, new int[]{x, y});
            position_Cube.put(key, newlyAddedOne);
        }

        // Find neighbors for the query cube
        if (!cube_Positions.containsKey(query)) {
            System.out.println("-1 -1 -1 -1");
            return;
        }

        int[] pos = cube_Positions.get(query);
        int Z = pos[0];
        int Y = pos[1];

        int up = getCube(position_Cube, Z, Y + 1);
        int down = getCube(position_Cube, Z, Y - 1);
        int left = getCube(position_Cube, Z - 1, Y);
        int right = getCube(position_Cube, Z + 1, Y);

        System.out.println(up + " " + down + " " + left + " " + right);
    }

    static int getCube(Map<String, Integer> posCube, int x, int y) {
        return posCube.getOrDefault(x + "," + y, -1);
    }
}
