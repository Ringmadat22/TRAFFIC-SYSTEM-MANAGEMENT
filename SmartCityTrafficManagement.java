// SmartCityTrafficManagement.java
public class SmartCityTrafficManagement {
    public static void main(String[] args) {
        CityGraph city = new CityGraph();
        city.addRoad("A", "B", 5);
        city.addRoad("A", "C", 10);
        city.addRoad("B", "D", 7);
        city.addRoad("C", "D", 8);
        city.addRoad("D", "E", 3);

        Intersection start = city.getOrCreateIntersection("A");
        
        ReportGenerator.generateComparisonReport(city, start);

        TrafficMonitoring trafficMonitor = new TrafficMonitoring();
        trafficMonitor.addVehicle("Car1", false);
        trafficMonitor.addVehicle("Ambulance1", true);
        System.out.println("Next vehicle to pass: " + trafficMonitor.dequeueVehicle());

        TrafficSignalControl.SignalNode rootSignal = new TrafficSignalControl.SignalNode(start);
        TrafficSignalControl signalController = new TrafficSignalControl(rootSignal);
        signalController.adjustSignalTiming(rootSignal, 5);

        TrafficCongestion congestionControl = new TrafficCongestion();
        congestionControl.recordVehicle(start, "Car1");
    }
}
