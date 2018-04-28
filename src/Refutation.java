import javafx.util.Pair;

import java.util.ArrayList;

public class Refutation {

    private ArrayList<Clause> KB;

    public void solve() {
        Pair<Character,Boolean> a = new Pair<>('a',true);
        Pair<Character,Boolean> anot = new Pair<>('a',false);

        Pair<Character,Boolean> b = new Pair<>('b',true);
        Pair<Character,Boolean> bnot = new Pair<>('b',false);

        Pair<Character,Boolean> c = new Pair<>('c',true);
        Pair<Character,Boolean> cnot = new Pair<>('c',false);

        Pair<Character,Boolean> d = new Pair<>('d',true);
        Pair<Character,Boolean> dnot = new Pair<>('d',false);

        Clause c0 = new Clause(a,bnot);
        Clause c1 = new Clause(b,cnot,dnot);
        Clause c2 = new Clause(b,c,dnot);
        Clause c3 = new Clause(d);

        KB = new ArrayList<Clause>();
        KB.add(c0);
        KB.add(c1);
        KB.add(c2);
        KB.add(c3);

        Clause startList = new Clause(anot); //negation of conjecture
        KB.add(startList);
        ClauseNode<Clause> start = new ClauseNode<Clause>(0,startList,KB); //starting clause - negation of proposition
        ClauseNode<Clause> goal =  new ClauseNode<Clause>(0,new Clause(),null); //empty clause

        AStarSearch astar = new AStarSearch();
        ArrayList<Edge> path = astar.findPath(start,goal);

        //print path
        Clause tempClause;
        if(path == null) {
            System.out.println("Contradiction not found! Conjecture unproved!");
            return;
        }
        System.out.println("Contradiction found! Conjecture proved!");
        System.out.println("Path starting from conclusion: ");
        for(Edge edge : path) {
            int i = 0;
            tempClause = (Clause) edge.getData();
            for(Pair<Character,Boolean> literal : tempClause.getLiterals()) {
                if(!literal.getValue()){ System.out.print("!");}
                System.out.print(literal.getKey().toString());

                if(i++ != tempClause.size() - 1){ System.out.print(" V ");}
            }
            System.out.println();
        }
    }
}
