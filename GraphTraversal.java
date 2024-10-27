// GraphTraversal.java
import java.util.*;

public class GraphTraversal {
    public void bfs(CityGraph city, String startName) {
        Intersection start = city.getOrCreateIntersection(startName);
        Set<Intersection> visited = new HashSet<>();
        Queue<Intersection> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Intersection current = queue.poll();
            System.out.println("Visited: " + current.name);

            for (Intersection neighbor : current.neighbors.keySet()) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public void dfs(CityGraph city, String startName) {
        Intersection start = city.getOrCreateIntersection(startName);
        Set<Intersection> visited = new HashSet<>();
        dfsHelper(start, visited);
    }

    private void dfsHelper(Intersection intersection, Set<Intersection> visited) {
        if (visited.contains(intersection)) return;

        visited.add(intersection);
        System.out.println("Visited: " + intersection.name);

        for (Intersection neighbor : intersection.neighbors.keySet()) {
            dfsHelper(neighbor, visited);
        }
    }
}
