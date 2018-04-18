import javafx.util.Pair;

import java.util.ArrayList;

public class RouteFinding {

    //INPUT
    //inital crossing (pair)
    //goal crossing (pair)
    //map of streets and coordinates (text file)

    //OUTPUT
    //route through streets (list of streets)

    public void solve() {

        ArrayList<Node<Pair<Integer,Integer>>> nodes = new  ArrayList<Node<Pair<Integer,Integer>>>();
        ArrayList<StreetEdge> edges = new  ArrayList<StreetEdge>();

        Node<Pair<Integer,Integer>> n1 = new Node<Pair<Integer,Integer>>(1,new Pair<>(10,70));
        Node<Pair<Integer,Integer>> n2 = new Node<Pair<Integer,Integer>>(2,new Pair<>(20,50));
        Node<Pair<Integer,Integer>> n3 = new Node<Pair<Integer,Integer>>(3,new Pair<>(35,35));
        Node<Pair<Integer,Integer>> n4 = new Node<Pair<Integer,Integer>>(4,new Pair<>(25,100));
        Node<Pair<Integer,Integer>> n5 = new Node<Pair<Integer,Integer>>(5,new Pair<>(35,80));
        Node<Pair<Integer,Integer>> n6 = new Node<Pair<Integer,Integer>>(6,new Pair<>(45,70));
        Node<Pair<Integer,Integer>> n7 = new Node<Pair<Integer,Integer>>(7,new Pair<>(55,55));
        Node<Pair<Integer,Integer>> n8 = new Node<Pair<Integer,Integer>>(8,new Pair<>(35,120));
        Node<Pair<Integer,Integer>> n9 = new Node<Pair<Integer,Integer>>(9,new Pair<>(50,90));
        Node<Pair<Integer,Integer>> n10 = new Node<Pair<Integer,Integer>>(10,new Pair<>(60,150));
        Node<Pair<Integer,Integer>> n11 = new Node<Pair<Integer,Integer>>(11,new Pair<>(60,110));
        Node<Pair<Integer,Integer>> n12 = new Node<Pair<Integer,Integer>>(12,new Pair<>(60,100));
        Node<Pair<Integer,Integer>> n13 = new Node<Pair<Integer,Integer>>(13,new Pair<>(70,85));
        Node<Pair<Integer,Integer>> n14 = new Node<Pair<Integer,Integer>>(14,new Pair<>(80,70));
        Node<Pair<Integer,Integer>> n15 = new Node<Pair<Integer,Integer>>(15,new Pair<>(65,100));

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

        StreetEdge e1 = new StreetEdge(1,n2,"Vestervoldgade",2,1);
        StreetEdge e2 = new StreetEdge(2,n4,"Noerrevoldgade",3,1.5);
        StreetEdge e3 = new StreetEdge(3,n5,"SktPedersStraede",1,2.5);
        StreetEdge e4 = new StreetEdge(4,n1,"Vestervoldgade",2,1);
        StreetEdge e5 = new StreetEdge(5,n3,"Vestervoldgade",1.5,1.5);
        StreetEdge e6 = new StreetEdge(6,n6,"Studiestraede",2,2.5);
        StreetEdge e7 = new StreetEdge(7,n2,"Vestervoldgade",1.5,1.5);
        StreetEdge e8 = new StreetEdge(8,n1,"Noerrevoldgade",3,1.5);
        StreetEdge e9 = new StreetEdge(9,n5,"TeglgaardsStraede",2,1);
        StreetEdge e10 = new StreetEdge(10,n8,"Noerrevoldgade",2,1);
        StreetEdge e11 = new StreetEdge(11,n9,"SktPedersStraede",1,1.5);
        StreetEdge e12 = new StreetEdge(12,n5,"Larsbjoernsstraede",1,1);
        StreetEdge e13 = new StreetEdge(13,n7,"Larsbjoernsstraede",1.5,1);
        StreetEdge e14 = new StreetEdge(14,n13,"Studiestraede",1.5,2.5);
        StreetEdge e15 = new StreetEdge(15,n3,"Vestergade",2,2);
        StreetEdge e16 = new StreetEdge(16,n4,"Noerrevoldgade",2,1);
        StreetEdge e17 = new StreetEdge(17,n10,"Noerrevoldgade",3,2.5);
        StreetEdge e18 = new StreetEdge(18,n8,"LarslejStraede",3,1.5);
        StreetEdge e19 = new StreetEdge(19,n8,"Noerrevoldgade",3,2.5);
        StreetEdge e20 = new StreetEdge(20,n11,"Noerregade",3,0);
        StreetEdge e21 = new StreetEdge(21,n12,"Noerregade",1,0);
        StreetEdge e22 = new StreetEdge(22,n13,"Noerregade",1.5,1);
        StreetEdge e23 = new StreetEdge(23,n14,"Noerregade",1.5,1);
        StreetEdge e24 = new StreetEdge(24,n7,"Vestergade",1.5,2.5);
        StreetEdge e25 = new StreetEdge(25,n9,"SktPedersStraede",1,1.5);


        edges.add(e1);
        edges.add(e2);
        edges.add(e3);
        edges.add(e4);
        edges.add(e5);
        edges.add(e6);
        edges.add(e7);
        edges.add(e8);
        edges.add(e9);
        edges.add(e10);
        edges.add(e11);
        edges.add(e12);
        edges.add(e13);
        edges.add(e14);
        edges.add(e15);
        edges.add(e16);
        edges.add(e17);
        edges.add(e18);
        edges.add(e19);
        edges.add(e20);
        edges.add(e21);
        edges.add(e22);
        edges.add(e23);
        edges.add(e24);
        edges.add(e25);

        n1.setNeighbourEdges( new StreetEdge[] {e1,e2,e3});
        n2.setNeighbourEdges( new StreetEdge[] {e4,e5,e6});
        n3.setNeighbourEdges( new StreetEdge[] {e7});
        n4.setNeighbourEdges( new StreetEdge[] {e8,e9,e10});
        n5.setNeighbourEdges( new StreetEdge[] {e11});
        n6.setNeighbourEdges( new StreetEdge[] {e12,e13,e14});
        n7.setNeighbourEdges( new StreetEdge[] {e15});
        n8.setNeighbourEdges( new StreetEdge[] {e16,e17});
        n9.setNeighbourEdges( new StreetEdge[] {e18});
        n10.setNeighbourEdges( new StreetEdge[] {e19,e20});
        n11.setNeighbourEdges( new StreetEdge[] {e21});
        n12.setNeighbourEdges( new StreetEdge[] {e22});
        n13.setNeighbourEdges( new StreetEdge[] {e23});
        n14.setNeighbourEdges( new StreetEdge[] {e24});
        n15.setNeighbourEdges( new StreetEdge[] {e25});

        Node<Pair<Integer,Integer>> start =  n8;
        Node<Pair<Integer,Integer>> goal = n6;

        //calculate estimated cost from current to goal - euclidean distance
        for (Node<Pair<Integer,Integer>> node : nodes) {
            Pair<Integer,Integer> goalPair = (Pair<Integer,Integer>) goal.getData();
            Pair<Integer,Integer> nodePair = (Pair<Integer,Integer>) goal.getData();

            double h = Math.abs(goalPair.getValue() - nodePair.getValue());
            double l = Math.abs(goalPair.getKey() - nodePair.getKey());
            node.setH(Math.sqrt(h*h+l*l));
        }

        AStarSearch astar = new AStarSearch();
        ArrayList<Edge> path = astar.findPath(start,goal);

        for(Edge edge : path) {
            System.out.println(edges.get((int)edge.getId()-1).getStreet());
        }
    }
}