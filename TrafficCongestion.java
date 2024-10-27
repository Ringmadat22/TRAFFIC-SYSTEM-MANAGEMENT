// TrafficCongestion.java
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TrafficCongestion {
    private Map<Intersection, Stack<String>> congestionStacks = new HashMap<>();

    public void recordVehicle(Intersection intersection, String vehicleId) {
        congestionStacks.computeIfAbsent(intersection, k -> new Stack<>()).push(vehicleId);
        if (congestionStacks.get(intersection).size() > 10) {
            System.out.println("Congestion detected at: " + intersection.name);
        }
    }

    public void resolveCongestion(Intersection intersection) {
        Stack<String> stack = congestionStacks.get(intersection);
        while (!stack.isEmpty()) {
            stack.pop();
        }
        System.out.println("Congestion cleared at: " + intersection.name);
    }
}
