public class Node<T> {

    private final int id;

    protected T data;

    //cost so far from start to current (initially, score from start to start is zero)
    private double g = Double.POSITIVE_INFINITY;

    //estimated cost from current to goal
    private double h;

    //f = g + h (initially h for start)
    private double f;

    //previous node/edge from current in optimal solution
    private Node previous;
    private Edge previousEdge;

    //neighbours
    private Edge[] neighbourEdges;

    public Node(int id,T data) {
        this.id = id;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public double getId() {
        return id;
    }

    public double getG() {
        return g;
    }

    public double getH() {
        return h;
    }

    public double getF() {
        return f;
    }

    public Node getPrevious() {
        return previous;
    }

    public Edge getPreviousEdge() {
        return previousEdge;
    }

    public Edge[] getNeighbourEdges(Object extra) {
        return neighbourEdges;
    }

    public void setG(double g) {
        this.g = g;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setF(double f) {
        this.f = f;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setPreviousEdge(Edge previousEdge) {
        this.previousEdge = previousEdge;
    }

    public void setNeighbourEdges(Edge[] neighbourEdges) {
        this.neighbourEdges = neighbourEdges;
    }
}
