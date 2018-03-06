import java.util.ArrayList;

public class Heureka {

    //INPUT
    //inital crossing (pair)
    //goal crossing (pair)
    //map of streets and coordinates (text file)

    //OUTPUT
    //route through streets (list of streets)


    public static void main(String[] args) {

        ArrayList<Node> nodes = new  ArrayList<Node>();

        Node n1 = new Node(1,10,70);
        Node n2 = new Node(2,20,50);
        Node n3 = new Node(3,35,35);
        Node n4 = new Node(4,25,100);
        Node n5 = new Node(5,35,80);
        Node n6 = new Node(6,45,70);
        Node n7 = new Node(7,55,55);
        Node n8 = new Node(8,35,120);
        Node n9 = new Node(9,50,90);
        Node n10 = new Node(10,60,150);
        Node n11 = new Node(11,60,110);
        Node n12 = new Node(12,60,100);
        Node n13 = new Node(13,70,85);
        Node n14 = new Node(14,80,70);
        Node n15 = new Node(15,65,100);

        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        nodes.add(n5);
        nodes.add(n6);
        nodes.add(n7);
        nodes.add(n8);
        nodes.add(n9);
        nodes.add(n10);
        nodes.add(n11);
        nodes.add(n12);
        nodes.add(n13);
        nodes.add(n14);
        nodes.add(n15);

        n1.setNeighbourEdges( new Edge[] {
                new Edge(n2,2,1),
                new Edge(n4,3,1.5),
                new Edge(n5,1,2.5)
            }
        );

        n2.setNeighbourEdges( new Edge[] {
                new Edge(n1,2,1),
                new Edge(n3,1.5,1.5),
                new Edge(n6,2,2.5)
            }
        );

        n3.setNeighbourEdges( new Edge[] {
                new Edge(n2,1.5,1.5)
            }
        );

        n4.setNeighbourEdges( new Edge[] {
                new Edge(n1,3,1.5),
                new Edge(n5,2,1),
                new Edge(n8,2,1)
            }
        );

        n5.setNeighbourEdges( new Edge[] {
                new Edge(n9,1,1.5)
            }
        );

        n6.setNeighbourEdges( new Edge[] {
                new Edge(n5,1,1),
                new Edge(n7,1.5,1),
                new Edge(n13,1.5,2.5)
            }
        );

        n7.setNeighbourEdges( new Edge[] {
                new Edge(n3,2,2)
            }
        );

        n8.setNeighbourEdges( new Edge[] {
                new Edge(n4,2,1),
                new Edge(n10,3,2.5)
            }
        );

        n9.setNeighbourEdges( new Edge[] {
                new Edge(n8,3,1.5)
            }
        );

        n10.setNeighbourEdges( new Edge[] {
                new Edge(n8,3,2.5),
                new Edge(n11,3,0)
            }
        );

        n11.setNeighbourEdges( new Edge[] {
                        new Edge(n12,1,0)
                }
        );

        n12.setNeighbourEdges( new Edge[] {
                new Edge(n13,1.5,1)
            }
        );

        n13.setNeighbourEdges( new Edge[] {
                new Edge(n14,1.5,1)
            }
        );

        n14.setNeighbourEdges( new Edge[] {
                new Edge(n7,1.5,2.5)
            }
        );

        n15.setNeighbourEdges( new Edge[] {
                new Edge(n9,1,1.5)
            }
        );

        Node start =  n8;
        Node goal = n6;

        for (Node node : nodes) {
            double h = Math.abs(goal.getY() - node.getY());
            double l = Math.abs(goal.getX() - node.getX());
            node.setH(Math.sqrt(h*h+l*l));
        }

        AStarSearch astar = new AStarSearch();
        ArrayList<Node> path = astar.findPath(start,goal);

        for(int i = 0;i < path.size();i++) {
            System.out.println(path.get(i).getId());
        }
    }
}