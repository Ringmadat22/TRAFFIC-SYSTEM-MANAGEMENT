// CityGraph.java
import java.util.HashMap;
import java.util.Map;

public class CityGraph {
    private Map<String, Intersection> intersections;

    public CityGraph() {
        this.intersections = new HashMap<>();
    }

    public Intersection getOrCreateIntersection(String name) {
        return intersections.computeIfAbsent(name, Intersection::new);
    }

    public void addRoad(String from, String to, int travelTime) {
        Intersection start = getOrCreateIntersection(from);
        Intersection end = getOrCreateIntersection(to);
        start.neighbors.put(end, travelTime);
    }

    public Map<String, Intersection> getIntersections() {
        return intersections;
    }
}
