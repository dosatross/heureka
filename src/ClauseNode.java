import javafx.util.Pair;

import java.util.ArrayList;

public class ClauseNode<T> extends Node<T> {

    private ArrayList<Clause> KB;

    public ClauseNode(int id, T data, ArrayList<Clause> KB) {
        super(id,data);
        this.KB = KB;
    }

    @Override
    public ArrayList<Edge> getNeighbourEdges() {
        for (int i = 0; i < KB.size();i++) {
            Clause clause = KB.get(i);
            //resolve and create new clause
            Clause resolvent = resolve((Clause) data, clause);
            if(resolvent != null) { //if only one contradiction found create resolvent node
                ArrayList<Clause> newKB = KB;
                newKB.add(resolvent);
                ClauseNode<Clause> resolventNode = new ClauseNode<Clause>(0,resolvent,newKB); //TODO manage ids
                resolventNode.setH(resolventNode.getData().size()); //calculate h - size of clause
                Edge<Clause> resolventEdge = new Edge<Clause>(0,clause,resolventNode,1); //create new edge
                neighbourEdges.add(resolventEdge);
            }
        }
        return neighbourEdges;
    }

    public Clause resolve(Clause c1, Clause c2) {
        Clause newClause = new Clause(c1,c2); //create clause out of c1 and c2

        Clause deleteCandidates = new Clause();

        for(Pair<Character,Boolean> literal : newClause.getLiterals()) {
            for(Pair<Character,Boolean> complement : newClause.getLiterals()) {
                if(literal.getKey() == complement.getKey() && literal.getValue() != complement.getValue()) { //if complements found
                    deleteCandidates.addLiterals(literal);
                }
            }
        }

        if (deleteCandidates.size() != 2) { //if more than one or no contradictions are found do not resolve
            return null;
        }

        newClause.removeLiterals(deleteCandidates); //remove contradicting literals

        return newClause;
    }
}