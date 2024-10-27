// ShortestPath.java
import java.util.*;

public class ShortestPath {

    public Map<Intersection, Integer> dijkstra(Intersection start) {
        Map<Intersection, Integer> distances = new HashMap<>();
        PriorityQueue<Intersection> pq = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        distances.put(start, 0);
        pq.add(start);

        while (!pq.isEmpty()) {
            Intersection current = pq.poll();
            int currentDist = distances.get(current);

            for (Map.Entry<Intersection, Integer> entry : current.neighbors.entrySet()) {
                Intersection neighbor = entry.getKey();
                int newDist = currentDist + entry.getValue();

                if (newDist < distances.getOrDefault(neighbor, Integer.MAX_VALUE)) {
                    distances.put(neighbor, newDist);
                    pq.add(neighbor);
                }
            }
        }
        return distances;
    }
}
