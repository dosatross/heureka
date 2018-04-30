//References:
//https://en.wikipedia.org/wiki/A*_search_algorithm
//https://gist.github.com/raymondchua/8064159
//https://codereview.stackexchange.com/questions/38376/a-search-algorithm
//https://github.com/aimacode/aima-pseudocode/blob/master/md/Uniform-Cost-Search.md

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.HashSet;

public class AStarSearch {

    public ArrayList<Edge> findPath(Node start,Node goal) {

        //frontier - nodes discovered but not expanded
        PriorityQueue<Node> open = new PriorityQueue<Node>(11, new NodeComparator());
        //explored - expanded nodes
        HashSet<Node> closed = new HashSet<Node>();

        //init source node
        start.setG(0);
        start.setF(start.getH());

        open.add(start); //add source node to queue

        while(!open.isEmpty()) {
            Node current = open.poll(); //pop - choose the lowest cost node from frontier
            closed.add(current);

            //goal test
            if(current.getData().equals(goal.getData())) {
                return reconstructPath(current);
            }

            for(Edge edge : (ArrayList<Edge>) current.getNeighbourEdges()) { //for each neighbour
                Node neighbour = edge.getTarget();
                double tentativeG = current.getG() + edge.getCost();
                double tentativeF = tentativeG + neighbour.getH();

                if(closed.contains(neighbour)) { //neighbour node already expanded
                    continue;
                }

                if (tentativeG < neighbour.getG()) { //node was already discovered and this path costs more
                    //update neighbour attributes
                    neighbour.setPrevious(current);
                    neighbour.setPreviousEdge(edge);
                    neighbour.setG(tentativeG);
                    neighbour.setF(tentativeF);

                    if(!open.contains(neighbour)) { //new node discovered
                        open.add(neighbour); //add to frontier
                    }
                }
            }
        }
        return null; //error
    }

    public class NodeComparator implements Comparator<Node> {
        public int compare(Node first, Node second) {
            if (first.getF() > second.getF()) {
                return 1;
            }
            else if (second.getF() > first.getF()) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }

    private ArrayList<Edge> reconstructPath(Node current) {
        ArrayList<Edge> path = new ArrayList<Edge>() {
        };
        while (current.getPreviousEdge() != null) {
            path.add(current.getPreviousEdge());
            current = current.getPrevious();
        }
        return path;
    }
}