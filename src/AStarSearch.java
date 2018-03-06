
//https://en.wikipedia.org/wiki/A*_search_algorithm
//https://gist.github.com/raymondchua/8064159
//https://codereview.stackexchange.com/questions/38376/a-search-algorithm

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.HashSet;

public class AStarSearch {

    public ArrayList<Node> findPath(Node start,Node goal) {

        //nodes discovered but not expanded
        PriorityQueue<Node> open = new PriorityQueue<Node>(11, new NodeComparator()); ; //frontier
        //expanded nodes
        HashSet<Node> closed = new HashSet<Node>();

        //init source node
        start.setG(0);
        start.setF(start.getH());

        open.add(start); //add source node to queue

        while(!open.isEmpty()) {

            Node current = open.poll();
            closed.add(current);

            if(current.equals(goal)) {
                return reconstructPath(current);
            }

            for(Edge edge : current.getNeighbourEdges()) { //for each neighbour
                Node neighbour = edge.getTarget();
                double tentativeG = current.getG() + edge.getCost();
                double tentativeF = tentativeG + neighbour.getH();

                if(closed.contains(neighbour)) { //neighbour node already expanded
                    continue;
                }

                if (tentativeG < neighbour.getG()) { //node was already discovered and this path costs more
                    //update neighbour attributes
                    neighbour.setPrevious(current);
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

    private ArrayList<Node> reconstructPath(Node current) {
        ArrayList<Node> path = new ArrayList<Node>() {
        };
        while (current != null) {
            path.add(current);
            current = current.getPrevious();
        }
        return path;
    }
}




