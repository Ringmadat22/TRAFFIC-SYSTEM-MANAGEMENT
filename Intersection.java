// Intersection.java
import java.util.HashMap;
import java.util.Map;

public class Intersection {
    String name;
    Map<Intersection, Integer> neighbors;

    public Intersection(String name) {
        this.name = name;
        this.neighbors = new HashMap<>();
    }
}
