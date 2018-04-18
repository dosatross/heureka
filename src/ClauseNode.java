import javafx.util.Pair;

import java.util.ArrayList;

public class ClauseNode<T> extends Node<T> {

    public ClauseNode(int id, T data) {
        super(id,data);
    }

    @Override
    public Edge[] getNeighbourEdges(Object extra) {

        ArrayList<Clause> KB = (ArrayList<Clause>) extra;

        Edge[] neighbourEdges = new Edge[KB.size()];
        for (int i = 0; i < KB.size();i++) {
            Clause clause = KB.get(i);
            //resolve and create new clause
            ClauseNode<Clause> newClauseNode = new ClauseNode<Clause>(0,resolve((Clause) data, clause)); //TODO manage ids
            newClauseNode.setH(newClauseNode.getData().size()); //calculate h - size of clause
            Edge<Clause> newClauseEdge = new Edge<Clause>(0,clause,newClauseNode,1); //create new edge
            neighbourEdges[i] = newClauseEdge;
        }
        setNeighbourEdges(neighbourEdges);
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

        newClause.removeLiterals(deleteCandidates); //remove contradicting literals

        return newClause;
    }
}