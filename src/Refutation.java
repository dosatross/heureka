import javafx.util.Pair;

import java.util.ArrayList;

public class Refutation {

    //essentially backward chaining

    //nodes - clause(literal list,premise,previous)  note: premise = parent

    //questions
    //node(state) is a clause or a literal? clause
    //sequence should not be able to find a leaf? (clause from kb) should be able to find a leaf (empty clause)
    //what data is to be used? kb clauses - inputted? can be hard coded
    //heuristic cost for this search? amount of clauses/literals



    private static ArrayList<ArrayList<Pair<Character,Boolean>>> KB;




    public void solve() {


        Pair<Character,Boolean> a = new Pair<>('a',true);
        Pair<Character,Boolean> anot = new Pair<>('a',false);

        Pair<Character,Boolean> b = new Pair<>('b',true);
        Pair<Character,Boolean> bnot = new Pair<>('b',false);

        Pair<Character,Boolean> c = new Pair<>('c',true);
        Pair<Character,Boolean> cnot = new Pair<>('c',false);

        Pair<Character,Boolean> d = new Pair<>('d',true);
        Pair<Character,Boolean> dnot = new Pair<>('d',false);

        ArrayList<Pair<Character,Boolean>> c0list = new ArrayList<Pair<Character,Boolean>>();
        ArrayList<Pair<Character,Boolean>> c1list = new ArrayList<Pair<Character,Boolean>>();
        ArrayList<Pair<Character,Boolean>> c2list = new ArrayList<Pair<Character,Boolean>>();
        ArrayList<Pair<Character,Boolean>> c3list = new ArrayList<Pair<Character,Boolean>>();

        c0list.add(a);
        c0list.add(bnot);


        c1list.add(b);
        c1list.add(cnot);
        c1list.add(dnot);

        c2list.add(b);
        c2list.add(c);
        c2list.add(dnot);

        c3list.add(d);

        ClauseNode<ArrayList<Pair<Character,Boolean>>> c0 = new ClauseNode<ArrayList<Pair<Character,Boolean>>>(1,c0list);
        ClauseNode<ArrayList<Pair<Character,Boolean>>> c1 = new ClauseNode<ArrayList<Pair<Character,Boolean>>>(2,c1list);
        ClauseNode<ArrayList<Pair<Character,Boolean>>> c2 = new ClauseNode<ArrayList<Pair<Character,Boolean>>>(3,c2list);
        ClauseNode<ArrayList<Pair<Character,Boolean>>> c3 = new ClauseNode<ArrayList<Pair<Character,Boolean>>>(4,c3list);

        KB = new ArrayList<ArrayList<Pair<Character,Boolean>>>();
        KB.add(c0list);
        KB.add(c1list);
        KB.add(c2list);
        KB.add(c3list);

        ArrayList<Pair<Character,Boolean>> startList = new ArrayList<Pair<Character,Boolean>>();
        startList.add(anot);
        ClauseNode<ArrayList<Pair<Character,Boolean>>> start = new ClauseNode<ArrayList<Pair<Character,Boolean>>>(0,startList); //starting clause - negation of proposition
        ClauseNode<ArrayList<Pair<Character,Boolean>>> goal =  new ClauseNode<ArrayList<Pair<Character,Boolean>>>(0,new ArrayList<Pair<Character,Boolean>>()); //empty clause

        AStarSearch astar = new AStarSearch(KB);
        ArrayList<Edge> path = astar.findPath(start,goal);

    }


}
