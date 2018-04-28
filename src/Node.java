import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node<T> {

    private final int id;

    protected T data;

    //cost so far from start to current (initially, score from start to start is zero)
    protected double g = Double.POSITIVE_INFINITY;

    //estimated cost from current to goal
    protected double h;

    //f = g + h (initially h for start)
    protected double f;

    //previous node/edge from current in optimal solution
    protected Node previous;
    protected Edge previousEdge;

    //neighbours
    protected ArrayList<Edge> neighbourEdges;

    public Node(int id,T data) {
        this.id = id;
        this.data = data;
        neighbourEdges = new ArrayList<Edge>();
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

    //override getNeighbourEdges() for dynamic graph building
    public ArrayList<Edge> getNeighbourEdges() {
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

    public void setNeighbourEdges(Edge ... edges) {
        neighbourEdges.addAll(Arrays.asList(edges));
    }
}
