public class Node {

    //data
    private final double x;
    private final double y;
    private final int id;

    //cost so far from start to current (initially, score from start to start is zero)
    private double g = Double.POSITIVE_INFINITY;

    //estimated cost from current to goal; euclidean distance for route finding
    private double h;

    //f = g + h (initially h for start)
    private double f;

    //previous = previous node from current in optimal solution
    private Node previous;

    //neighbours
    private Edge[] neighbourEdges;

    public Node(int id, double x, double y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public double getId() {
        return id;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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

    public Edge[] getNeighbourEdges() {
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

    public void setNeighbourEdges(Edge[] neighbourEdges) {
        this.neighbourEdges = neighbourEdges;
    }
}
