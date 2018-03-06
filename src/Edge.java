
public class Edge {
    private final double cost;
    private final Node target;

    public Edge(Node target, double h, double l){
        this.target = target;
        this.cost = Math.sqrt(h*h+l*l);
    }

    public double getCost() {
        return cost;
    }

    public Node getTarget() {
        return target;
    }
}
