// TrafficMonitoring.java
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TrafficMonitoring {
    private Queue<String> vehicleQueue = new LinkedList<>();
    private PriorityQueue<String> emergencyQueue = new PriorityQueue<>();

    public void addVehicle(String vehicleId, boolean isEmergency) {
        if (isEmergency) {
            emergencyQueue.add(vehicleId);
        } else {
            vehicleQueue.add(vehicleId);
        }
    }

    public String dequeueVehicle() {
        return !emergencyQueue.isEmpty() ? emergencyQueue.poll() : vehicleQueue.poll();
    }
}
