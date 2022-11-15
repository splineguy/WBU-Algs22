import edu.princeton.cs.algs4.CC;
import edu.princeton.cs.algs4.Graph;

public class GraphProperties {
    private int[] eccentricities;
    private int diameter;
    private int radius;
    private int center;

    public GraphProperties(Graph graph) {
        eccentricities = new int[graph.V()];
        CC cc = new CC(graph);

        if (cc.count() != 1) {
            throw new RuntimeException("Graph must be connected!");
        }

        getProperties(graph);
    }

    private void getProperties(Graph graph) {
        return;
    }

    public int diameter() {
        return diameter;
    }

    public int radius() {
        return radius;
    }

    public int center() {
        return center;
    }

    public static void main(String[] args) {

    }
}
