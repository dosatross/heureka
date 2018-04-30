
public class Edge<T> {
    protected final int id;
    protected T data;
    protected final Node target;
    protected double cost;

    public Edge(int id, T data, Node target,double cost){
        this.id = id;
        this.data = data;
        this.target = target;
        this.cost = cost;
    }

    public double getId() {
        return id;
    }

    public T getData() {
        return data;
    }

    public Node getTarget() {
        return target;
    }

    public double getCost() {
        return cost;
    }
}
