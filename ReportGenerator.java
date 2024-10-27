// ReportGenerator.java
import java.util.Map;

public class ReportGenerator {

    public static void generateComparisonReport(CityGraph city, Intersection start) {
        ShortestPath pathCalculator = new ShortestPath();

        Map<Intersection, Integer> dijkstraResult = pathCalculator.dijkstra(start);

        System.out.println("Comparison Report for Shortest Path Algorithms:");
        System.out.println("Using Dijkstra’s algorithm from " + start.name + ":");
        dijkstraResult.forEach((intersection, distance) -> {
            System.out.println("To " + intersection.name + ": " + distance);
        });
    }
}
