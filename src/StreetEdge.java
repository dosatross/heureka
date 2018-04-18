public class StreetEdge extends Edge {

    private final String street;

    public StreetEdge(int id, Node target, String street, double h, double l){
        super(id, target);
        cost = Math.sqrt(h*h+l*l);
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

}
