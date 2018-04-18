
public class Edge {
    private final int id;
    protected double cost;
    private final Node target;

    public Edge(int id, Node target){
        this.id = id;
        this.target = target;
    }

    public double getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }

    public Node getTarget() {
        return target;
    }


}
