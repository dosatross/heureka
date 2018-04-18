import javafx.util.Pair;

import java.util.ArrayList;

public class ClauseEdge extends Edge {

    private ArrayList<Pair<Character,Boolean>> literals;

    public ClauseEdge(int id, Node target, ArrayList<Pair<Character,Boolean>> literals){
        super(id, target);
        this.literals = literals;
        cost = 1; //unit cost
    }

}
