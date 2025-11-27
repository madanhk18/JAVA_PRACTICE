import java.util.*;

public class kumbTCS {
    static Map<String, Set<String>> graph_map = new HashMap<>();
    static Map<String, Set<String>> restrictions_map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        // Read iniial connctions
        for (int i = 0; i < N; i++) {
            String[] parts = sc.nextLine().split(" ");
            String src = parts[0];
            graph_map.putIfAbsent(src, new HashSet<>());
            for (int j = 1; j < parts.length; j++) {
                String dest = parts[j];
                graph_map.putIfAbsent(dest, new HashSet<>());
                graph_map.get(src).add(dest);
                graph_map.get(dest).add(src); // bidirectional
            }
        }

        int Q = Integer.parseInt(sc.nextLine());
        List<String> queries_list = new ArrayList<>();
        for (int i = 0; i < Q; i++) queries_list.add(sc.nextLine());

        int R = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < R; i++) {
            String[] parts_arr = sc.nextLine().split(" ");
            String src = parts_arr[0];
            restrictions_map.putIfAbsent(src, new HashSet<>());
            for (int j = 1; j < parts_arr.length; j++)
                restrictions_map.get(src).add(parts_arr[j]);
        }

        // Process quries
        for (String query : queries_list) {
            if (query.contains(" to ")) {
                String[] parts = query.split(" to ");
                String source = parts[0];
                String dest = parts[1];
                System.out.println(can_Travel(source, dest) ? "yes" : "no");
            } else if (query.contains(" connects ")) {
                String[] parts_array = query.split(" connects ");
                String u = parts_array[0];
                String v = parts_array[1];
                graph_map.putIfAbsent(u, new HashSet<>());
                graph_map.putIfAbsent(v, new HashSet<>());
                graph_map.get(u).add(v);
                graph_map.get(v).add(u);
            } else if (query.contains(" disconnects ")) {
                String[] parts = query.split(" disconnects ");
                String u = parts[0];
                String v = parts[1];
                if (graph_map.containsKey(u)) graph_map.get(u).remove(v);
                if (graph_map.containsKey(v)) graph_map.get(v).remove(u);
            }
        }
    }

    static boolean can_Travel(String source, String dest) {
        Set<String> visited = new HashSet<>();
        Set<String> restricted = restrictions_map.getOrDefault(source, new HashSet<>());
        return dfs_function(source, dest, visited, restricted);
    }

    static boolean dfs_function(String current, String dest, Set<String> visited, Set<String> restricted) {
        if (restricted.contains(current)) return false;
        if (current.equals(dest)) return true;
        visited.add(current);
        for (String neighbor : graph_map.getOrDefault(current, new HashSet<>())) {
            if (!visited.contains(neighbor)) {
                if (dfs_function(neighbor, dest, visited, restricted)) return true;
            }
        }
        return false;

    }
    }
