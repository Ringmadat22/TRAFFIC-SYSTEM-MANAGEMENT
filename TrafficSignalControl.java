// TrafficSignalControl.java
public class TrafficSignalControl {
    static class SignalNode {
        Intersection intersection;
        int vehiclesWaiting;
        SignalNode left, right;

        SignalNode(Intersection intersection) {
            this.intersection = intersection;
            this.vehiclesWaiting = 0;
        }
    }

    SignalNode root;

    public TrafficSignalControl(SignalNode root) {
        this.root = root;
    }

    public void adjustSignalTiming(SignalNode node, int newVehicleCount) {
        node.vehiclesWaiting = newVehicleCount;
        rebalanceTree(node);
    }

    private void rebalanceTree(SignalNode node) {
        // Implementation can be added for rebalancing if needed
    }
}
