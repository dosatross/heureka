import javafx.util.Pair;

import java.util.ArrayList;

public class ClauseNode<T> extends Node<T> {
    public ClauseNode(int id, T t) {
        super(id,t);
    }

    @Override
    public Edge[] getNeighbourEdges(Object extra) {

        ArrayList<ArrayList<Pair<Character,Boolean>>> KB = (ArrayList<ArrayList<Pair<Character,Boolean>>>) extra;
        //input - kb

        Edge[] neighbourEdges = new Edge[KB.size()];
        for (int i = 0; i < KB.size();i++) {
            ArrayList<Pair<Character,Boolean>> clause = KB.get(i);
            //resolve and create new clause
            ClauseNode<ArrayList<Pair<Character,Boolean>>> newClauseNode = new ClauseNode<ArrayList<Pair<Character,Boolean>>>(0,resolve((ArrayList<Pair<Character,Boolean>>) data, clause)); //TODO manage ids
            newClauseNode.setH(newClauseNode.getData().size()); //calculate h - size of clause
            ClauseEdge newClauseEdge = new ClauseEdge(0,newClauseNode,clause); //create new edge
            neighbourEdges[i] = newClauseEdge;
        }
        setNeighbourEdges(neighbourEdges);
        return neighbourEdges;
    }

    public ArrayList<Pair<Character,Boolean>> resolve(ArrayList<Pair<Character,Boolean>> c1, ArrayList<Pair<Character,Boolean>> c2) {
        ArrayList<Pair<Character,Boolean>> newClause = new ArrayList<Pair<Character,Boolean>>();
        //concat clauses
        newClause.addAll(c1);
        newClause.addAll(c2);

        ArrayList<Pair<Character,Boolean>> deleteCandidates = new ArrayList<Pair<Character,Boolean>>();

        for(Pair<Character,Boolean> literal : newClause) {
            for(Pair<Character,Boolean> complement : newClause) {
                if(literal.getKey() == complement.getKey() && literal.getValue() != complement.getValue()) { //if complements found
                    deleteCandidates.add(literal);
                }
            }
        }

        newClause.removeAll(deleteCandidates);

        return newClause;
    }
}